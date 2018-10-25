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
public class ScreenResource {
	String screenName;
	String screenAccess; // R, RW, W
	String listUrl;
	String recordUrl;
	String updateUrl;
	String deleteUrl;
	List<SearchFieldResource> searchFieldList;
	List<String> displayFieldList;
	List<String> detailFieldList;
	List<String> createFieldList;
	List<String> updateFieldList;
}
