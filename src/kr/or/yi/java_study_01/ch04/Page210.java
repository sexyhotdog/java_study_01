package kr.or.yi.java_study_01.ch04;

public class Page210 {
	public static void main(String[] args) {
		MethodSample a = new MethodSample();
		
		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.1, 2.2);
		System.out.println(i);
		System.out.println(j);
		System.out.printf("%.2f",k);
	}
}
