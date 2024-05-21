package org.junt_class1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class exc2 {
	
	@BeforeClass
	public static void m1() {
		System.out.println("BeforeClass");
		}
	
	@Before
	public void m2() {
		System.out.println("Before");
		}
	
	@AfterClass
	public static void m3() {
		System.out.println("Afterclass");
		}
	
	@After
	public void m4() {
		System.out.println("After");
		}
	
	@Test
	public void m5() {
		System.out.println("test1 : login");
			}
	
	@Test
	public void m6() {
		System.out.println("test2 : screenshot");
		
	}

}
