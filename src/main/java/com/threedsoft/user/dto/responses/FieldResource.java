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
public class FieldResource {
	String fieldName;
	// for detail resources to access this field with this name (ex:- during adding
	// a new order dtl, orderId needs to be part of add. But the field name is id
	// in the hdr. alias name is the name by which this field and value needs to be
	// passed to the dtl screens.
	String fieldDisplayName;
	String fieldDataType;
	String fieldLength;
	String isPrimaryField = "N";
	String fieldType = "text"; // text, dropdown
	String allowedValues = ""; // dropdown list of values
	String defaultValue = ""; // default value in the list of allowed values for edit
	String primaryKeyFieldDtlFieldName;
	String hiddenField;
	private static String TEXT_FIELD="text";
	private static String DROPDOWN_FIELD="dropdown";
	
	public static FieldResource createField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength) {
		FieldResource fieldResource = new FieldResource();
		fieldResource.fieldName = fieldName;
		fieldResource.fieldDisplayName = fieldDisplayName;
		fieldResource.fieldDataType = fieldDataType;
		fieldResource.fieldLength = fieldLength;
		fieldResource.hiddenField = "N";
		return fieldResource;
	}

	public static FieldResource createHiddenField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength) {
		FieldResource fieldResource = new FieldResource();
		fieldResource.fieldName = fieldName;
		fieldResource.fieldDisplayName = fieldDisplayName;
		fieldResource.fieldDataType = fieldDataType;
		fieldResource.fieldLength = fieldLength;
		fieldResource.hiddenField = "Y";
		return fieldResource;
	}
	public static FieldResource createDropDownField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength,
			String allowedValues, String defaultValue) {
		FieldResource fieldResource = new FieldResource();
		fieldResource.fieldName = fieldName;
		fieldResource.fieldDisplayName = fieldDisplayName;
		fieldResource.fieldDataType = fieldDataType;
		fieldResource.fieldLength = fieldLength;
		fieldResource.fieldType=DROPDOWN_FIELD;
		fieldResource.allowedValues=allowedValues;
		fieldResource.defaultValue=defaultValue;
		fieldResource.hiddenField = "N";
		return fieldResource;
	}

/*	public static FieldResource createMandatoryDropDownField(String fieldName, String fieldDisplayName, String fieldDataType, String fieldLength,
			String allowedValues, String defaultValue) {
		FieldResource fieldResource = new FieldResource();
		fieldResource.fieldName = fieldName;
		fieldResource.fieldDisplayName = fieldDisplayName;
		fieldResource.fieldDataType = fieldDataType;
		fieldResource.fieldLength = fieldLength;
		fieldResource.fieldType=DROPDOWN_FIELD;
		fieldResource.allowedValues=allowedValues;
		fieldResource.defaultValue=defaultValue;
		fieldResource.hiddenField = "N";
		fieldResource.mandatoryField="Y";
		return fieldResource;
	}
*/
	public static FieldResource createPrimaryField(String fieldName, String fieldDisplayName, String fieldDataType,
			String fieldLength) {
		FieldResource fieldResource = new FieldResource();
		fieldResource.fieldName = fieldName;
		fieldResource.fieldDisplayName = fieldDisplayName;
		fieldResource.fieldDataType = fieldDataType;
		fieldResource.fieldLength = fieldLength;
		fieldResource.isPrimaryField = "Y";
		fieldResource.hiddenField = "N";
//		fieldResource.mandatoryField="Y";
		return fieldResource;
	}
}
