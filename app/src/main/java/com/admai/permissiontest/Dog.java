package com.admai.permissiontest;

import com.admai.permissiontest.Json.JsonNode;

import java.util.List;

/**
 * Created by ZAN on 16/11/17.
 */
public class Dog {
	
	@JsonNode(key="summary")  
	public String title;  
	@JsonNode(key = "description")    
	public String desc;
	@JsonNode(key = "location")
	public String location;
	@JsonNode(key = "start")
	public String start;
	@JsonNode(key = "end")
	public String end;     
	@JsonNode(key = "reminder")
	public String reminder;
	@JsonNode(key = "allday")
	public boolean allday;
	
	@JsonNode(key = "recurrence")
	public List<AdBody> AdBody;
	
	
	
	public static class AdBody {
		@JsonNode(key = "date")
		public int date;
		@JsonNode(key = "hum")
		public int hum;
		
		@Override
		public String toString() {
			return "-date-"+date+"-hum-"+hum;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "title-"+title + "-desc-" + desc+"-location-" +location+"-start-"+start+"-recurrence-"+AdBody.toString();
	}
	
}
