package org.Swagger_document_day9;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateList_output_pojo {
	private int status;
	private String message;
	private ArrayList<StateList> data;

}
