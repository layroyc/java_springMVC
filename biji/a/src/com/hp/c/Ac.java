package com.hp.c;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import com.hp.entity.LogParser;

public class Ac {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Job job =Job.getInstance(conf);
		job.setJarByClass(Ac.class);
		job.setMapperClass(MyMapper.class);
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);
		
		job.setReducerClass(MyReduce.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		
		job.setPartitionerClass(MyPartition.class);
		job.setNumReduceTasks(3);
		
		FileInputFormat.setInputPaths(job, new Path("access.txt"));
		FileOutputFormat.setOutputPath(job, new Path("out"));
		
		job.waitForCompletion(true);
	}
	static class MyMapper extends Mapper<LongWritable, Text, Text, Text>{
		private LogParser parser;
		@Override
		protected void setup(org.apache.hadoop.mapreduce.Mapper.Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			parser = new LogParser();
		}
		@Override
		protected void map(LongWritable key, Text value,
				org.apache.hadoop.mapreduce.Mapper.Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			String line = value.toString();
			String[] fields = parser.parse(line);
			String ip = fields[0];
			String time = fields[1];
			String url = fields[2];
			String status = fields[3];
			String traffic = fields[4];
			StringBuilder builder = new StringBuilder();
			builder.append(time+",");
			builder.append(url+",");
			builder.append(status+",");
			builder.append(traffic);
			context.write(new Text(ip), new Text(builder.toString()));
		}
	}
	static class MyReduce extends Reducer< Text, Text, Text, NullWritable>{
		@Override
		protected void reduce(Text key, Iterable<Text> value,
				Reducer< Text, Text, Text, NullWritable>.Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			for (Text v : value) {
				context.write(new Text(v+","+key), NullWritable.get());
			}
		}
	}
	static class MyPartition extends Partitioner<Text, Text>{

		@Override
		public int getPartition(Text key, Text arg1, int arg2) {
			// TODO Auto-generated method stub
			if(key.toString().equals("27.19.74.143")){
				return 0;
			}else if(key.toString().equals("110.52.250.126")){
				return 1;
			}else{
				return 2;
			}
		}
		
	}
}
