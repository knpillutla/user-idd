package com.threedsoft.user.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.threedsoft.user.dto.requests.UserLoginInRequestDTO;
import com.threedsoft.util.dto.events.ExceptionEvent;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class UserLoginFailedEvent extends ExceptionEvent{
	public UserLoginFailedEvent(UserLoginInRequestDTO req, String serviceName, String errorMsg) {
		this(req, serviceName, errorMsg, null);
	}

	public UserLoginFailedEvent(UserLoginInRequestDTO req, String serviceName, String errorMsg,
			Exception exObj) {
		this(req, serviceName, errorMsg, exObj, null);
	}

	public UserLoginFailedEvent(UserLoginInRequestDTO req, String serviceName, String errorMsg,
			Exception exObj, Map headerMap) {
		super("UserLoginFailedEvent", "", -1, "", "",
				"", "User", req.getUserName(), serviceName, req, errorMsg, exObj);
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}	
}
