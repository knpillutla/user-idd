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
public class DashboardScreenResource extends ScreenResource{
	List<DashboardTileResource> tiles;
	public DashboardScreenResource(String screenName, String screenDisplayName, String screenTitle, 
			String screenAccess) {
		super(screenName, screenDisplayName, screenTitle, screenAccess, "dashboard", null);
	}
	
	public void add(DashboardTileResource resource) {
		tiles.add(resource);
	}
}
