package org.Day2_Task2_read_ObjectMapping;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Datum {

	private int id;
	private String flightName;
    @JsonProperty("Country") 
    private String country;
    @JsonProperty("Destinations") 
    private String destinations;
    @JsonProperty("URL") 
    private String uRL;

	

}
