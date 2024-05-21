package org.Day3_task1_write_OM;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pojo {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<Datum>data;
	private Support support;
	

}
