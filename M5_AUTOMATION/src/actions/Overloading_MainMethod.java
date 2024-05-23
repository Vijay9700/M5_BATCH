package actions;

public class Overloading_MainMethod {
public static void main(int A) {
	System.out.println(A);
}
public static void main(String name) {
	System.out.println(name);
}
public static void main(byte a) {
	System.out.println(a);
}
public static void main(char a) {
	System.out.println(a);
}

public static void main(String args []) {
	main("java");
	main(20);
	main('G');
	main(12);
}
}
