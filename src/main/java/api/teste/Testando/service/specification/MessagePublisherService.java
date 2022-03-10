package api.teste.Testando.service.specification;

import com.fasterxml.jackson.core.JsonProcessingException;

import api.teste.Testando.model.DTO.MonitorDTO;

public interface MessagePublisherService {

	void publish(MonitorDTO execution) throws JsonProcessingException;

}
