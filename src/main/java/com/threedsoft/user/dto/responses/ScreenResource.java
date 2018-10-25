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
	List<SearchFieldResource> searchFieldList = new ArrayList();
	List<String> displayFieldList = new ArrayList();
	List<String> detailFieldList = new ArrayList();
	List<String> createFieldList = new ArrayList();
	List<String> updateFieldList = new ArrayList();
}
