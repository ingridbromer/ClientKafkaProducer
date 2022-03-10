package api.teste.Testando.model.DTO;
import java.time.LocalDateTime;
import java.util.UUID;

import api.teste.Testando.model.enums.TypeMessage;
import lombok.Data;

@Data
public class MonitorDTO {
	
	private UUID id = UUID.randomUUID();
	
	private UUID executionId;

	private UUID integrationId;

	private String message;

	private UUID sourcerId;

	private UUID targetId;

	private Integer step;

	private String payloadPattern;

	private String errorTrace;

	private String errorMessage;

	private String first;

	private String last;

	private String selectedValue;

	private String businessObject;

	private Long recordCount;

	private Long errorCount;

	private LocalDateTime finishedOn;

	private LocalDateTime occurrenceOn;

	private TypeMessage type;
	
}
