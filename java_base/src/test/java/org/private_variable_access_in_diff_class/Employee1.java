package org.private_variable_access_in_diff_class;

public class Employee1 {
	
	private int id;
	private String name;
	private long phoneNo;
	
	public Employee1(int id, String name, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}
	
	
	
/* without using get and set
 * we can asses private variable in different class by using
 * right click-->sourse--->genderate constructor using field
 */
	

}
