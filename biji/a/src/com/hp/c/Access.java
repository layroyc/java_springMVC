package com.hp.c;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Access {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf);
		job.setJarByClass(Access.class);
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(NullWritable.class);
		job.setMapOutputValueClass(Text.class);
		FileInputFormat.setInputPaths(job, new Path("/customer.txt"));
		FileOutputFormat.setOutputPath(job, new Path("/output"));
		job.waitForCompletion(true);
	
	}
	static class MyMapper extends Mapper<LongWritable, Text, NullWritable, Text>{
		@Override
		protected void map(LongWritable key, Text value,
				org.apache.hadoop.mapreduce.Mapper.Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			String line = value.toString();
			String[] file = line.split(",");
			String phone = file[0];
			String url = file[3];
			String time = file[4];
			StringBuilder builder = new StringBuilder();
			builder.append(phone+",");
			builder.append(url+",");
			builder.append(time);
			context.write(NullWritable.get(), new Text(builder.toString()));
		}
	}
}
