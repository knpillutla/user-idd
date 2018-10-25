package com.threedsoft.user.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.threedsoft.user.dto.requests.UserCreationRequestDTO;
import com.threedsoft.util.dto.events.ExceptionEvent;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class UserCreationFailedEvent extends ExceptionEvent{
	public UserCreationFailedEvent(UserCreationRequestDTO req, String serviceName, String errorMsg) {
		this(req, serviceName, errorMsg, null);
	}

	public UserCreationFailedEvent(UserCreationRequestDTO req, String serviceName, String errorMsg,
			Exception exObj) {
		this(req, serviceName, errorMsg, exObj, null);
	}

	public UserCreationFailedEvent(UserCreationRequestDTO req, String serviceName, String errorMsg,
			Exception exObj, Map headerMap) {
		super("UserCreationFailedEvent", req.getBusName(), req.getDefLocnNbr(), "", "",
				"", "User", req.getLoginUserId(), serviceName, req, errorMsg, exObj);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}	
}
