package com.threedsoft.user.dto.responses;

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
public class DataResource {
	String name;
	String displayName;
	String searchUrl;
	String listUrl;
	// String getRecordUrl;
	String addRecordUrl;
	String updateRecordUrl;
	String deleteRecordUrl;
	List<FieldResource> fieldList;
	List<SearchFieldResource> searchFieldList;
	String listFields;
	//String viewFields;
	//String addRecordFields;
	//String editRecordFields;
	List<ActionResource> recordActionList;
	DataResource primaryDtlResource;
	List<DataResource> dtlResources;
	List<AddFieldResource> addResourceFieldList;
	List<ViewEditFieldResource> viewResourceFieldList;
	List<ViewEditFieldResource> editResourceFieldList;
	String hdrDisplayFields;
	BrowserViewerResource browserViewerResource;

	public DataResource(String name, String displayName, String searchUrl, String listUrl, String addRecordUrl,
			String updateRecordUrl, String deleteRecordUrl) {
		this.name = name;
		this.displayName = displayName;
		this.searchUrl = searchUrl;
		this.listUrl = listUrl;
		this.addRecordUrl = addRecordUrl;
		this.updateRecordUrl = updateRecordUrl;
		this.deleteRecordUrl = deleteRecordUrl;
	}
}
