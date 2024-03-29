package kr.or.yi.java_study_01.ch05;

class Person2 {

}

class Student2 extends Person2 {

}

class Researcher extends Student2 {

}

class Professor extends Researcher {

}

public class InstanceOfEx02 {
	static void print(Person2 p) {
		if (p instanceof Person2) {
			System.out.print("Person2");
		}
		if (p instanceof Student2) {
			System.out.print("Student2");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher");
		}
		if (p instanceof Professor) {
			System.out.print("Professor");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student2() -> \t");
		print(new Student2());
		System.out.print("new Researcher() -> \t");
		print(new Researcher());
		System.out.print("new Professor() -> \t");
		print(new Professor());
	}
}
