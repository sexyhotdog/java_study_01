package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class MethodCall {
	
	public static void main(String[] args) {
//		void_method(5);
//		int res = return_method(3, 5);
//		System.out.println("res = " + res);
//		
//		
//		
//		
//		
//		
//		makeIntArrray(5);
		
		
		
		int a =5;
		int b =3;
		System.out.printf("a = %d, b = %d %n", a, b);
		swap(a,b);
		System.out.printf("a = %d, b = %d %n", a, b);
		
		
		int [] arr = {5, 3};
		System.out.printf("변경전 arr[0] = %d, arr[1] = %d %n", arr[0], arr[1]);
		swap(arr);
		System.out.printf("변경후 arr[0] = %d, arr[1] = %d %n", arr[0], arr[1]);
	}
	
	private static void swap(int[] arr) {
		int temp = arr[0];
		arr [0]= arr[1];
		arr[1]= temp;
		System.out.printf("swap(int[]arr) ==> arr[0] = %d, arr[1] = %d %n", arr[0],arr[1]);
		
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("swap(int a, int b) a = %d, b = %d %n", a, b);
		
	}

	private static void makeIntArrray(int size) {
		int [] temp = new int [size];
		System.out.println(Arrays.toString(temp));
	}

	public static int return_method(int a, int b) {
		int c = a+ b;
		return c;
	}
	
	public static void void_method(int size) {
		System.out.println("size = " + size);
		return;
	}
}
