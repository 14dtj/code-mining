/**
 * hadoop map-reduce算法实现大数据处理
 */
public int run(String[] args) throws Exception {

        Job job = Job.getInstance(getConf(), $jobName);
        job.setJarByClass($className);
        FileInputFormat.setInputPaths(job, inputPath);
        job.setMapperClass(Mapper.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Text.class);


        job.setReducerClass(Reducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        FileOutputFormat.setOutputPath(job, new Path(outputPath));

        return job.waitForCompletion(true) ? 0 : 1;
        }

/**
 * 分组
 */
public static class Mapper extends Mapper<LongWritable, Text, Text, Text> {

    @Override
    protected void map(LongWritable key, Text text, Mapper<LongWritable, Text, Text, Text>.Context context)
            throws IOException, InterruptedException {
        $key, $value = $anylyze(text);
        context.write(new Text($key), new Text($value));
        }
    }

}

/**
 * 处理分组后的数据
 */
public static class Reducer extends Reducer<Text, Text, Text, Text> {

    @Override
    protected void reduce(Text key, Iterable<Text> values, Reducer<Text, Text, Text, Text>.Context context)
            throws IOException, InterruptedException {



        for (Text value : values) {
            $readValue;
            $compare/$calculate/$merge;

        }


        context.write(key, new Text($result));

    }

}

