package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class ArrayEx01 {
	public static void main(String[] args) {
//		array01();
//		array02();
		Scanner sc = new Scanner(System.in);
		
		
//		char[] chArr= new char[26];
//		char ch = 'a';
//		for (int i =0; i<chArr.length; i++) {
//			System.out.printf("%c ", chArr[i]);
//			chArr[i]= ch++;
//		}
//		System.out.println();
//		for(int i=0; i<chArr.length; i++) {
//			System.out.printf("%d ", (int)chArr[i]);
//		}
//		System.out.println();
//		for(int i=0; i<chArr.length; i++) {
//			System.out.printf("%d ", chArr[i]);
//		}
//		int [] intArray03 =new int[5];
//		int max=0;
//		System.out.println("양수 5개를 입력하세요.");
//		for(int i=0; i<5; i++) {
//			intArray03[i] = sc.nextInt();
//			if(intArray03[i]>max) {
//				max= intArray03[i];
//			}
//		}
//		System.out.print("가장 큰 수는 " + max + "입니다.");
		
		
		int [] intArray03 =new int[5];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			intArray03[i] = sc.nextInt();
			if(intArray03[i]>max) {
				max= intArray03[i];
			}
			if(intArray03[i]<min) {
				min= intArray03[i];
			}
		}
		System.out.print("가장 작은 수는 " + min + "입니다.");
		System.out.print("가장 큰 수는 " + max + "입니다.");
		
		System.out.println("찾고자 하는 정수값을 입력하세요.>>> ");
		int searchKey = sc.nextInt();
		//intArray에 searchKey가 존재하면 위치하고 있는 인덱스를 출력하고 찾지 못하면 -1을 출력하도록 작성하시오.
		int findIndex = -1;
		for(int i=0; i<intArray03.length; i++) {
			if (searchKey == intArray03[i]) {
				findIndex=i;
				break;
			}
		}
		System.out.printf("searchKey %d는 %d위치에 있습니다.", searchKey, findIndex);
	
		sc.close();
	}

//	private static void array02() {
//		//선언과 동시에 초기화
//		int[] intArray = {5, 4, 3, 2, 1};
//		for(int i=0; i<intArray.length; i++) {
//			System.out.printf("%d ", intArray[i]);
//		}
//		intArray[2]= 10;
//		
//		
//		int[] myArray = intArray;
//		for(int i=0; i<myArray.length; i++) {
//			System.out.printf("%d ", myArray[i]);
//		}
//	}

//	private static void array01() {
//		int [] intArray01 = null;//정수형 배열 선언
//		System.out.println(intArray01);
//		intArray01 =new int[5];
//		System.out.println(intArray01[0]);
//		System.out.println(intArray01[1]);
//		System.out.println(intArray01[2]);
//		System.out.println(intArray01[3]);
//		System.out.println(intArray01[4]);
//		System.out.println("배열의 크기" + intArray01.length);
//		
//		for(int i=0;i<intArray01.length;i++) {
//			System.out.printf("%d ", intArray01[i]);
//		}
//	}
}
