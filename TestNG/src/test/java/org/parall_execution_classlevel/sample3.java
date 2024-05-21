package org.parall_execution_classlevel;

import org.testng.annotations.Test;

public class sample3 {
   @Test
	private void tc6() {
		
	    System.out.println(Thread.currentThread().getId());
}

private void tc7() {
	
	    System.out.println(Thread.currentThread().getId());
}

}
