package testng_basics;

import org.testng.annotations.Test;

public class Basics {
	
	public static void main(String[] args) {
		System.out.println("from main");
	}
	
	@Test
	public void test() {
		System.out.println("from test");
	}

}
