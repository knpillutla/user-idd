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
public class SearchFieldResource {
	String fieldName;
	String searchAppender;
	String hideField;
	Object defaultValue; // default value for add

	public static SearchFieldResource createHiddenFieldWithDefaultValue(String fieldName, Object defaultValue) {
		SearchFieldResource resource = new SearchFieldResource();
		resource.fieldName = fieldName;
		resource.hideField = "Y";
		resource.defaultValue = defaultValue;
		return resource;
	}

	public static SearchFieldResource createSearchField(String fieldName) {
		SearchFieldResource resource = new SearchFieldResource();
		resource.fieldName = fieldName;
		resource.hideField = "N";
		return resource;
	}

	public static SearchFieldResource createHiddenFieldWithDefaultValue(String fieldName, String searchAppender,
			Object defaultValue) {
		SearchFieldResource resource = new SearchFieldResource();
		resource.fieldName = fieldName;
		resource.hideField = "Y";
		resource.defaultValue = defaultValue;
		resource.searchAppender = searchAppender;
		return resource;
	}

	public static SearchFieldResource createSearchField(String fieldName, String searchAppender) {
		SearchFieldResource resource = new SearchFieldResource();
		resource.fieldName = fieldName;
		resource.hideField = "N";
		resource.searchAppender = searchAppender;
		return resource;
	}
}
