package org.Swagger_document_day9;
import lombok.Data;
@Data

public class UserRole {
	private int id;
	private String role;
	private String name;
	private String status;
	private String created_at;
	private String updated_at;
	private Pivot pivot;

}
