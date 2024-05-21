package com.Reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting_JVMReporting {
	
	public static void generateJVMReport(String jsonfile) {
		
		//mention the where the report should be located
		File f=new File(System.getProperty("user.dir")+"\\target");
		
	//te set configeration of the report
		Configuration co=new Configuration(f,"omr");//(file reff name,project name(report is genderate))
		
		//in report what should be specified in feature
		//please specified based on requirement document
		//i typed by own
		co.addClassifications("plat form Name","window");
		co.addClassifications("plat form version","11");
		co.addClassifications("author","faiyaz");
		co.addClassifications("enviroment", "QA");
		co.addClassifications("SprintName","34");
		
		//create object for reportbuilde class
		
		//reportbuilding class accept only List<string> where input is String jsonfile
		//so we store the String jsonfile in the list<string>
		
		List<String> files=new ArrayList<String>();
		
		files.add(jsonfile);
		
		ReportBuilder builder=new ReportBuilder(files, co);
		
		builder.generateReports();
	
	
	}
	

}
