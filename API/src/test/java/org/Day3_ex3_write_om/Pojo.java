package org.Day3_ex3_write_om;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pojo {
	private String name;
	private String email;
	private long phoneNo;
	private ArrayList<String> course;

}
