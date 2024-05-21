package org.test_rerun2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Sample_failed implements IRetryAnalyzer {//this class is used to run only the failed testcase multiple time

	
	int min=0,max=3;
	
	@Override
	public boolean retry(ITestResult result) {

		if(min<max) {
			
			min++;
			return true;
		}	
		return false;
/*tc2 failed-->sample_failed-->min=0,max=3-->retry method is responsable for rerun-->0<3(min<max)-->0+1=1-->return true-->same test will rerun again
 *again tc2 failed-->sample_failed-->min=1,max=3-->retry method is responsable for rerun-->1<3(min<max)-->1+1=2-->return true-->same test will rerun again 
 *again tc2 failed-->sample_failed-->min=1,max=3-->retry method is responsable for rerun-->2<3(min<max)-->2+1=3-->return true-->same test will rerun again 
 *again tc2 failed-->sample_failed-->min=1,max=3-->retry method is responsable for rerun-->3<3(min<max)-->loop end--------> return to faile
 */
	
	
	
	
	}
	
}
