package java_6Nouvember;

public class Creation_Of_TheClass {

	public static void main(String[] args) {
		System.out.println("this is the main method");
		
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		
		Creation_Of_TheClass.method1();
		Creation_Of_TheClass.method2();
		Creation_Of_TheClass.method3();
		Creation_Of_TheClass.method4();
		Creation_Of_TheClass.method5();
		Creation_Of_TheClass.method6();
		Creation_Of_TheClass objref=new Creation_Of_TheClass();
		objref.method7();
		objref.method8();
		objref.method9();
		objref.method10();
	}

	public static void method1() {
		System.out.println("this is the  method1");

	}

	public static void method2() {
		System.out.println("this is the method2");

	}

	public static void method3() {
		System.out.println("this is the method3");
	}

	public static void method4() {
		System.out.println("this is the method4");
	}

	public static void method5() {
		System.out.println("this is the method5");
	}

	public static void method6() {
		System.out.println("this is the method6");
	}

	public  void method7() {
		System.out.println("this is the  method7");
	}

	public  void method8() {
		System.out.println("this is the  method8");
	}

	public  void method9() {
		System.out.println("this is the  method9");
	}

	public  void method10(){
		System.out.println("this is the method10");
	}
	
}