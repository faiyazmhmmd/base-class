package org.parall_execution_classlevel;

import org.testng.annotations.Test;

public class sample2 {
	@Test
	private void tc4() {
		 
	    System.out.println(Thread.currentThread().getId());
}

private void tc5() {
	 
	    System.out.println(Thread.currentThread().getId());
}

}
