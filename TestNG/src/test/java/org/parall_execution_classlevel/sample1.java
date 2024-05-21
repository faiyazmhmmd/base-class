package org.parall_execution_classlevel;

import org.testng.annotations.Test;

class sample1 {
	@Test
	public void tc() {
	    
	    System.out.println(Thread.currentThread().getId());
		}
		
		public void tc2() {
			 
			    System.out.println(Thread.currentThread().getId());
	    }
	   
		private void tc3() { 
	    	
	    System.out.println(Thread.currentThread().getId());

		}

}
