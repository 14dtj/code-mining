/**
 * help to pull messages from Kafka using Spark Streaming to improve performance
 */
public class KafkaSparkConsumer<E extends Serializable> implements Runnable, Serializable, AutoCloseable {
    public KafkaSparkConsumer(
            KafkaConfig config,
            ZkState zkState,
            Receiver<MessageAndMetadata<E>> receiver,
            KafkaMessageHandler messageHandler) {
       $set member variables;
    }

    @Override
    public void close() {
        $closeConnection;
    }

    @Override
    public void run() {
        try {
            while (!$receiver.isStopped()) {
                long timeSinceLastPull = System.currentTimeMillis() - $lastConsumeTime;
                if (timeSinceLastPull >= $config) {
                    $lastConsumeTime = System.currentTimeMillis();
                    createStream();
                } else {
                        Thread.sleep($waitTime);
                }
            }
        } catch (Exception ex) {
            $handleException
        }
    }


}