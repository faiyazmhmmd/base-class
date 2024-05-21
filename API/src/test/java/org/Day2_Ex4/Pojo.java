package org.Day2_Ex4;

import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

import lombok.Data;

@Data
public class Pojo {
	 private String name;
	 private String email;
	 private long phoneNo;
	 private Boolean payment;
	 private ArrayList<EmpDetail> empDetail;
	 private boolean var;
	 
}
