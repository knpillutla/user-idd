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
public class ViewEditFieldResource {
	String fieldName;
	String disableField;
	String hideField;
	String defaultValue;
	
	public static ViewEditFieldResource createTextField(String fieldName) {
		ViewEditFieldResource editFieldResource = new ViewEditFieldResource();
		editFieldResource.fieldName=fieldName;
		return editFieldResource;
	}

	public static ViewEditFieldResource createDisabledField(String fieldName) {
		ViewEditFieldResource editFieldResource = new ViewEditFieldResource();
		editFieldResource.fieldName=fieldName;
		editFieldResource.disableField="Y";
		return editFieldResource;
	}
	public static ViewEditFieldResource createHiddenField(String fieldName) {
		ViewEditFieldResource editFieldResource = new ViewEditFieldResource();
		editFieldResource.fieldName=fieldName;
		editFieldResource.hideField="Y";
		return editFieldResource;
	}
}
