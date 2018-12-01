package com.threedsoft.user.dto.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class DashboardTileResource {
	private String name;
	private String description;
	private String type; // pie chart, heatmap, line graph, bar graph, LIST
	private String url;
	
	public static String TYPE_LIST = "LIST";
	public static String TYPE_PIECHART= "PIECHART";
	public static String TYPE_HEATMAP = "HEATMAP";
	public static String TYPE_LINEGRAPH = "LINEGRAPH";
	public static String TYPE_BARGRAPH = "BARGRAPH";
}
