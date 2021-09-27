package com.hp.bigdata.hive;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class One {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		Path outputPath = new Path("output");
		if (fs.exists(outputPath)) {
				fs.delete(outputPath, true);
		}
		Job job = Job.getInstance();
		job.setJarByClass(One.class);
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(NullWritable.class);
		job.setMapOutputValueClass(Text.class);
		
		FileInputFormat.setInputPaths(job, new Path("access.log"));
		FileOutputFormat.setOutputPath(job, new Path("output"));
		job.waitForCompletion(true);
	}
	static class MyMapper extends Mapper<LongWritable, Text, NullWritable,Text>{
		@Override
		protected void map(LongWritable key, Text value,
				org.apache.hadoop.mapreduce.Mapper.Context context)
				throws IOException, InterruptedException {
			String line = value.toString();
			String[] fields = line.split("\t");
			String date =fields[0];
			String[] fields2 = date.split(" ");
			String date2 = fields2[0];
			String url = fields[1];
			String flow = fields[2];
			String ip = fields[3];
			String sex = fields[4];
			
			//创建缓冲区
			StringBuilder builder = new StringBuilder();
			builder.append(date2+"\t");
			builder.append(url+"\t");
			builder.append(flow+"\t");
			builder.append(ip+"\t");
			builder.append(sex);
			
			//写到上下文
			context.write(NullWritable.get(), new Text(builder.toString()));
		}
	}
}
