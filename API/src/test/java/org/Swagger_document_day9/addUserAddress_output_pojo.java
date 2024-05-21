package org.Swagger_document_day9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class addUserAddress_output_pojo {
	private int status;
    private String message;
    private int address_id;

}
