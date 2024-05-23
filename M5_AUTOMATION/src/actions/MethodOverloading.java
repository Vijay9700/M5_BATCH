package actions;

public class MethodOverloading {

	public static void add() {
		System.out.println("No arg_Method :) ");
	}
	
	public static void add(int a) {
		System.out.println(a);
	}
	
	public static void add(char a,int b) {
		System.out.println(a+b);
	}
	
	public static void add(double a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		add();
		add(10,10,20);
	}

}
