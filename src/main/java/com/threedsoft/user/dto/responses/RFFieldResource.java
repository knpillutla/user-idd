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
public class RFFieldResource {
	String fieldName="";
	String fieldDisplayName="";
	String fieldType="label"; // label,text
	String fieldDataType = "string";
	String hideField = "N";
	Object defaultValue;
	String fieldLength = "20";
//	String userInputNeeded="N"; // Y/N
	String dataTriggerUrl="";
	String validateInputWithField=""; // field name from the response of dataURL to validate the entered value
	String validationFailedErrorMsg="";
	String actionUrl=""; // if exists and not null, then prompt for confirmation to execute this.
	String dataTriggerErrorMsg = "";
	// this field qualifies to continue on to next screen.ex:-when entered qty <
	// actual qty and tote is full, they may want to end the tote and continue with
	// remaining qty in to a new tote
	String continueInNextScreen="N";
	String inputListToActionUrl="";

	public static RFFieldResource createHiddenField(String fieldName, Object defaultValue) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.defaultValue = defaultValue;
		rfFieldResource.fieldType="label";
		rfFieldResource.hideField="Y";
		rfFieldResource.fieldDataType = "string";
		rfFieldResource.fieldLength="20";
		return rfFieldResource;
	}

	public static RFFieldResource createLabelField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.fieldDisplayName = fieldDisplayName;
		rfFieldResource.fieldDataType = fieldDataType;
		rfFieldResource.fieldLength = fieldLength;
		rfFieldResource.fieldType="label";
		return rfFieldResource;
	}

	public static RFFieldResource createTextField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.fieldDisplayName = fieldDisplayName;
		rfFieldResource.fieldDataType = fieldDataType;
		rfFieldResource.fieldLength = fieldLength;
		rfFieldResource.fieldType="text";
		return rfFieldResource;
	}

	public static RFFieldResource createTextFieldWithValidation(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength,
			String validateInputWithField, String validationFailedErrorMsg) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.fieldDisplayName = fieldDisplayName;
		rfFieldResource.fieldDataType = fieldDataType;
		rfFieldResource.fieldLength = fieldLength;
		rfFieldResource.fieldType="text";
		rfFieldResource.validateInputWithField = validateInputWithField;
		rfFieldResource.validationFailedErrorMsg = validationFailedErrorMsg;
		return rfFieldResource;
	}

	public static RFFieldResource createDataTriggerTextField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength,
			String dataUrl, String dataTriggerErrorMsg) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.fieldDisplayName = fieldDisplayName;
		rfFieldResource.fieldDataType = fieldDataType;
		rfFieldResource.fieldLength = fieldLength;
		rfFieldResource.fieldType="text";
		rfFieldResource.dataTriggerUrl = dataUrl;
		rfFieldResource.dataTriggerErrorMsg = dataTriggerErrorMsg;
		return rfFieldResource;
	}

	public static RFFieldResource createDataTriggerHiddenLabelField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength,
			String dataUrl, String dataTriggerErrorMsg) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.fieldDisplayName = fieldDisplayName;
		rfFieldResource.fieldDataType = fieldDataType;
		rfFieldResource.fieldLength = fieldLength;
		rfFieldResource.hideField="Y";
		rfFieldResource.fieldType="label";
		rfFieldResource.dataTriggerUrl = dataUrl;
		rfFieldResource.dataTriggerErrorMsg = dataTriggerErrorMsg;
		return rfFieldResource;
	}

	public static RFFieldResource createDataTriggerLabelField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength,
			String dataUrl, String dataTriggerErrorMsg) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.fieldDisplayName = fieldDisplayName;
		rfFieldResource.fieldDataType = fieldDataType;
		rfFieldResource.fieldLength = fieldLength;
		rfFieldResource.dataTriggerUrl = dataUrl;
		rfFieldResource.fieldType="label";
		rfFieldResource.dataTriggerErrorMsg = dataTriggerErrorMsg;
		return rfFieldResource;
	}

	public static RFFieldResource createActionTextFieldWithValidation(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength,
			String validateInputWithField, String validationFailedErrorMsg, String actionUrl,
			String inputListToActionUrl, String continueInNextScreen) {
		RFFieldResource rfFieldResource = new RFFieldResource();
		rfFieldResource.fieldName = fieldName;
		rfFieldResource.fieldDisplayName = fieldDisplayName;
		rfFieldResource.fieldDataType = fieldDataType;
		rfFieldResource.fieldLength = fieldLength;
		rfFieldResource.fieldType="text";
		rfFieldResource.validateInputWithField = validateInputWithField;
		rfFieldResource.validationFailedErrorMsg = validationFailedErrorMsg;
		rfFieldResource.actionUrl = actionUrl;
		rfFieldResource.inputListToActionUrl = inputListToActionUrl;
		rfFieldResource.continueInNextScreen = continueInNextScreen;
		return rfFieldResource;
	}
}
