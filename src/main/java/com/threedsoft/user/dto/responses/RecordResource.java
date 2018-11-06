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
public class RecordResource {
	String recordName;
	String recordDisplayName;
	String searchUrl;
	String listUrl;
	String getRecordUrl;
	String addRecordUrl;
	String updateRecordUrl;
	String deleteRecordUrl;
	List<FieldResource> fieldList;
	List<String> searchFieldList;
	List<String> listDisplayFieldList;
	List<String> displayRecordFieldList;
	List<String> addRecordFieldList;
	List<String> updateRecordFieldList;
}
