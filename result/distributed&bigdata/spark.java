/**
 * spark 实时计算
 */
        SparkConf conf = new SparkConf()
                    .setMaster($param)
                    .setAppName($name);
				    .set($key, $value);
				    .set($key, $value);

				    JavaStreamingContext jssc = new JavaStreamingContext(
                conf, Durations.seconds($duration));
                jssc.checkpoint($url);

                Map<String, String> kafkaParams = new HashMap<String, String>();
        kafkaParams.put($key,
        ConfigurationManager.getProperty(Constants.KAFKA_METADATA_BROKER_LIST));


        String kafkaTopics = ConfigurationManager.getProperty(Constants.KAFKA_TOPICS);
        String[] kafkaTopicsSplited = kafkaTopics.split(",");

        Set<String> topics = new HashSet<String>();
        for (String kafkaTopic : kafkaTopicsSplited) {
            topics.add(kafkaTopic);
        }

        JavaPairInputDStream<String, String> adRealTimeLogDStream = KafkaUtils.createDirectStream(
        jssc,
        String.class,
        String.class,
        StringDecoder.class,
        StringDecoder.class,
        kafkaParams,
        topics);


       $list = $filterList;
       $calculateRealTimeStat($list);
       $calculateRealTimeStat($list);
       $calculateRealTimeStat($list);


        jssc.start();
        jssc.awaitTermination();
        jssc.close();