package kr.or.yi.java_study_01.ch04;

public class TestMain {
	public static void main(String[] args) {
//		prnTest();
		
		TestMain tm = new TestMain();
		tm.prnTest();
	}
	public static void prn() {
		System.out.println("HoHo");
	}
	public void prnTest() {
		System.out.println("HaHa");
		TestMain.prn();
		
	}
}
