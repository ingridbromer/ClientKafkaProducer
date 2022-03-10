package api.teste.Testando;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import api.teste.Testando.model.DTO.MonitorDTO;
import api.teste.Testando.service.KafkaPublisherService;

@RestController
@RequestMapping("/teste")
public class Controller {

	@Autowired
	private KafkaPublisherService service;
	
	@PostMapping
	public void send(@RequestBody MonitorDTO execution) throws JsonProcessingException {
		service.publish(execution);
	}
}
