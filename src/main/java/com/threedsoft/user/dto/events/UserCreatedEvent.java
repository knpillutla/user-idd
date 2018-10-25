package com.threedsoft.user.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.user.dto.responses.UserResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class UserCreatedEvent extends WMSEvent {

	public UserCreatedEvent(UserResourceDTO resourceDTO, String serviceName) {
		this(resourceDTO, serviceName, null);
	}

	public UserCreatedEvent(UserResourceDTO resourceDTO, String serviceName, Map headerMap) {
		super("UserCreatedEvent", resourceDTO.getBusName(), resourceDTO.getDefLocnNbr(), "",
				"", "", "User", resourceDTO.getLoginUserId(),
				serviceName, resourceDTO);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
