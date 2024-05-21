package org.parall_execution_methodleve;

import org.testng.annotations.Test;

public class sample {

	@Test
	public void tc() {

		System.out.println(Thread.currentThread().getId());
	}

	@Test
	public void tc2() {

		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc3() {

		System.out.println(Thread.currentThread().getId());

	}

	@Test
	private void tc4() {

		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc5() {

		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc6() {

		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc7() {

		System.out.println(Thread.currentThread().getId());
	}

}
