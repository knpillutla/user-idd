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
public class RFScreenResource extends ScreenResource{
	String screenName;
	String screenDescription;
	String screenAccessLevel;
	int emptyLinesBetweenFieldResources;
	int widthOfScreen; // num of characters wide
	int heightOfScreen; // total number of lines including empty lines
	List<RFFieldResource> rfFieldResourceList;
	RFButtonResource buttonResource;
	
	public RFScreenResource(String screenName, String screenDisplayName, String screenTitle, String screenAccess,
			int emptyLinesBetweenFieldResources, int widthOfScreen, int heightOfScreen) {
		super(screenName,screenDisplayName, screenTitle, screenAccess, "RF", null);
		this.emptyLinesBetweenFieldResources=emptyLinesBetweenFieldResources;
		this.widthOfScreen=widthOfScreen;
		this.heightOfScreen=heightOfScreen;
	}
}
