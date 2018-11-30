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
public class AddFieldResource {
	String fieldName;
	String disableField;
	String hideField;
	Object defaultValue; // generally used in add/edit
	
	public static AddFieldResource createDisabledFieldWithDefaultValue(String fieldName, Object defaultValue) {
		AddFieldResource addFieldResource = new AddFieldResource();
		addFieldResource.fieldName=fieldName;
		addFieldResource.disableField="Y";
		addFieldResource.defaultValue=defaultValue;
		return addFieldResource;
	}
	
	public static AddFieldResource createHiddenFieldWithDefaultValue(String fieldName, Object defaultValue) {
		AddFieldResource addFieldResource = new AddFieldResource();
		addFieldResource.fieldName=fieldName;
		addFieldResource.hideField="Y";
		addFieldResource.defaultValue=defaultValue;
		return addFieldResource;
	}

	public static AddFieldResource createTextField(String fieldName) {
		AddFieldResource addFieldResource = new AddFieldResource();
		addFieldResource.fieldName=fieldName;
		return addFieldResource;
	}
}
