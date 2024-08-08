package day03;

public class MyDef02 {
	public static void main(String[] args) {
		showDan(7);
	}
	
	public static void showDan(int dan) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan*i));
		}
	}
}
