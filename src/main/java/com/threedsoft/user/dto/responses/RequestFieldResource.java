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
public class RequestFieldResource {
	String fieldName;
	String fieldDisplayName;
	String fieldDataType;
	String fieldLength;
	String fieldType; // list,single value
	String promptForInput; //Y,N
	
	public RequestFieldResource(String fieldName, String fieldType, String promptForInput) {
		this.fieldName=fieldName;
		this.fieldType=fieldType;
		this.promptForInput=promptForInput;
	}
	public RequestFieldResource(String fieldName, String displayName, String fieldType, String promptForInput) {
		this.fieldName=fieldName;
		this.fieldDisplayName=fieldDisplayName;
		this.fieldType=fieldType;
		this.promptForInput=promptForInput;
	}
}
