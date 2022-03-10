package api.teste.Testando.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppConfigProperties {
	
	private String outputKafkaTopic;
	
	private int kafkaTopicNumPartitions;

	private short kafkaTopicReplicationFactor;
	
	public String getOutputKafkaTopic() {
		return outputKafkaTopic;
	}

	public void setOutputKafkaTopic(String kafkaTopic) {
		this.outputKafkaTopic = kafkaTopic;
	}
	
	public int getkafkaTopicNumPartitions() {
		return kafkaTopicNumPartitions;
	}

	public short getkafkaTopicReplicationFactor() {
		return kafkaTopicReplicationFactor;
	}

	public void setkafkaTopicNumPartitions(int kafkaTopicNumPartitions) {
		this.kafkaTopicNumPartitions = kafkaTopicNumPartitions;
	}

	public void setkafkaTopicReplicationFactor(short kafkaTopicReplicationFactor) {
		this.kafkaTopicReplicationFactor = kafkaTopicReplicationFactor;
	}
}
