package com.threedsoft.user.dto.responses;

import java.util.ArrayList;
import java.util.List;

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
public class FieldResource {
	String fieldName;
	String fieldDisplayName;
	String disableField;
	String hideField;
	String fieldDataType;
	String fieldLength;
	String allowedValues;
	String displayOptions;
	String fieldType;

	public FieldResource(String fieldName, String fieldDisplayName, String disableField, String hideField,
			String fieldDataType, String fieldLength, String allowedValues, String displayOptions) {
		this.fieldName=fieldName;
		this.fieldDisplayName=fieldDisplayName;
		this.disableField=disableField;
		this.hideField=hideField;
		this.fieldDataType=fieldDataType;
		this.fieldLength=fieldLength;
		this.allowedValues=allowedValues;
		this.displayOptions=displayOptions;
		this.fieldType="text";
	}
}
