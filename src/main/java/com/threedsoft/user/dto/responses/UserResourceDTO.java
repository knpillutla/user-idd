package com.threedsoft.user.dto.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.threedsoft.util.dto.WMSResourceDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class UserResourceDTO  extends WMSResourceDTO{
	Long id;
	String busName;
	Integer defLocnNbr;
	String userName;
	String authType;
	String firstName;
	String lastName;
	String middleName;
	String roleName;
	String addr1;
	String addr2;
	String addr3;
	String city;
	String state;
	String country;
	String zipCode;
	String locale;
	String theme;
	String menuType;
	String userType;
	String userId;
	List<MenuResource> menuResourceList;
	DashboardScreenResource dashboardResource;
}
