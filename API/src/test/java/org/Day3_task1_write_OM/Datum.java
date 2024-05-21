package org.Day3_task1_write_OM;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datum {
	
	private int id;
	private String flightName;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Destinations")
	private String destinations;
	@JsonProperty("URL")
	private String url;

}
