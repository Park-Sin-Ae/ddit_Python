package day03;

public class MyDef01 {
	
	public static void main(String[] args) {
		int sum = add(4,2);
		int mul = multiple(4, 2);
		System.out.println("sum : " + sum);
		System.out.println("mul : " + mul);
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int multiple(int a, int b) {
		return a * b;
	}
}
