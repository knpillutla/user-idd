package com.threedsoft.user.dto.responses;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class RFButtonResource {
	String name;
	String displayName;
	String confirmationMsg;
	String actionUrl;
	String inputFieldListToActionUrl;
	String resetFieldAfterConfirm;
	String exitScreen; // y,n
	String httpMethod;

	public RFButtonResource(String name, String displayName, String confirmationMsg, String actionUrl,
			String inputFieldListToActionUrl, String resetFieldAfterConfirm, String exitScreen) {
		this.name = name;
		this.displayName = displayName;
		this.confirmationMsg = confirmationMsg;
		this.actionUrl = actionUrl;
		this.inputFieldListToActionUrl = inputFieldListToActionUrl;
		this.resetFieldAfterConfirm = resetFieldAfterConfirm;
		this.exitScreen = exitScreen;
		this.httpMethod = "POST";
	}
}
