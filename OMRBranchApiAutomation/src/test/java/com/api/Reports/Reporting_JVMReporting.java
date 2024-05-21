package com.api.Reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting_JVMReporting {
	//mention the where the report should be located
	
	public static void generateJvmReport(String jsonFile) {
		File f=new File(System.getProperty("user.dir")+"\\target");
		
		Configuration co=new Configuration(f, "API_JVMReporting");
		
		co.addClassifications("Sprint", "34");
		co.addClassifications("Testing", "Reg");
		co.addClassifications("Author", "Faiyaz Mohammed");
		co.addClassifications("Env","QA");
		
		List<String> jsonfiles=new ArrayList<>();
		
		jsonfiles.add(jsonFile);
		
		ReportBuilder builder=new ReportBuilder(jsonfiles, co);
		
		builder.generateReports();

	}
			
		

}
