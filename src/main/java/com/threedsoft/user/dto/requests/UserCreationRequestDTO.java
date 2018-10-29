package com.threedsoft.user.dto.requests;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.threedsoft.util.dto.WMSRequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class UserCreationRequestDTO extends WMSRequestDTO{
	String busName;
	Integer defLocnNbr;
	String userName;
	String authType;
	String authToken;
	String firstName;
	String lastName;
	String middleName;
	String addr1;
	String addr2;
	String addr3;
	String city;
	String state;
	String country;
	String zipCode;
	String locale;
	String userId;
}
