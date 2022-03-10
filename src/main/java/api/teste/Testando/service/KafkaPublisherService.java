package api.teste.Testando.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.teste.Testando.config.AppConfigProperties;
import api.teste.Testando.model.DTO.MonitorDTO;
import api.teste.Testando.service.specification.MessagePublisherService;

@Service
public class KafkaPublisherService implements MessagePublisherService {

	@Autowired
	private AppConfigProperties appProperties;
	
	@Autowired
	private KafkaTemplate<String, MonitorDTO> kafkaTemplate;

	@Autowired
	private ObjectMapper myMapper;

	private static final Logger LOG = LoggerFactory.getLogger(KafkaPublisherService.class);


	@Override
	public void publish(MonitorDTO execution) throws JsonProcessingException {
		LOG.info("Sending '{}' to topic = '{}' ", execution, appProperties.getOutputKafkaTopic());
		
		Message<String> message = MessageBuilder.withPayload(myMapper.writeValueAsString(execution))
				.setHeader(KafkaHeaders.TOPIC, appProperties.getOutputKafkaTopic()).build();
		
		kafkaTemplate.send(message);
	}

}
