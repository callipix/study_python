package day03;

public class MyTest {

	public static void showdan(int dan) {
		System.out.println(dan + "*" + 1 + "=" + (dan * 1));
		System.out.println(dan + "*" + 2 + "=" + (dan * 2));
		System.out.println(dan + "*" + 3 + "=" + (dan * 3));
		System.out.println(dan + "*" + 4 + "=" + (dan * 4));
//		System.out.println(dan + "*" +5+ "=" + (dan*5));
		System.out.println(dan + "*" + 6 + "=" + (dan * 6));
		System.out.println(dan + "*" + 7 + "=" + (dan * 7));
		System.out.println(dan + "*" + 8 + "=" + (dan * 8));
		System.out.println(dan + "*" + 9 + "=" + (dan * 9));
		System.out.println();
	}

	public static void main(String[] args) {

		
		 showdan(9); showdan(7); showdan(4); showdan(2);
		 

		// 9,7,5,3

		/*
		 * for (int i = 9; i >= 2; i--) {
		 * 
		 * for (int j = 1; j <= 9; j++) {
		 * 
		 * if (i == 9 || i == 7 || i == 4 || i == 2) {
		 * 
		 * if (j != 5) { System.out.println(i + "*" + j + "=" + i * j); } }
		 * 
		 * } System.out.println(); }
		 */
	}
}