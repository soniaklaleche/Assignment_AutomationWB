package java_6Nouvember;

public class Create_5_Classes_Assignement {

	public static void main(String[] args) {
		System.out.println("this is rthe main method");

		eating1();
		sleaping1();
		Begging1();
		jumping1();
		running1();
		Bitting1();
		
		Create_5_Classes_Assignement.eating1();
		Create_5_Classes_Assignement.sleaping1();
		Create_5_Classes_Assignement.Begging1();
		Create_5_Classes_Assignement.jumping1();
		Create_5_Classes_Assignement.running1();
		Create_5_Classes_Assignement.Bitting1();
		
		
		
		Create_5_Classes_Assignement dog = new Create_5_Classes_Assignement();
		Create_5_Classes_Assignement dog1 = new Create_5_Classes_Assignement();
		
		dog.chewing1();
		dog.playing1();
		dog.barking1();
		dog.digging1();
		dog1.chewing1();
		dog1.playing1();
		dog1.barking1();
		dog1.digging1();
		
		cat catt = new cat();
		cat animal=new cat();
		
	catt.eating();
	catt.sniffing();
	catt.playing();
	catt.digging();
	catt.barking();
	animal.eating();
	animal.sniffing();
	animal.playing();
	animal.digging();
	animal.barking();
	
	cat.Begging();
	cat.jumping();
	cat.running();
	cat.Bitting();
	cat.chewing();
		
	//I can not call the static methods without using the class name
	
	}

	public static void eating1() {
		System.out.println("dog1");

	}

	public static void sleaping1() {
		System.out.println("dog2");
	}

	public static void Begging1() {
		System.out.println("dog1");

	}

	public static void jumping1() {
		System.out.println("dog2");

	}

	public static void running1() {
		System.out.println("dog1");
	}

	public static void Bitting1() {
		System.out.println("dog2");
	}

	public void chewing1() {
		System.out.println("dog1");
	}

	public void playing1() {
		System.out.println("dog2");

	}

	public void barking1() {
		System.out.println("dog1");
	}

	public void digging1() {
		System.out.println("dog2");
	}

}

class cat {
	
	
	public static void Begging() {
		System.out.println("cat1");

	}

	public static void jumping() {
		System.out.println("cat2");

	}

	public static void running() {
		System.out.println("cat3");
	}

	public static void Bitting() {
		System.out.println("cat4");
	}

	public static void chewing() {
		System.out.println("cat5");
	}

	public void eating() {
		System.out.println("cat6");

	}

	public void barking() {
		System.out.println("cat7");
	}

	public void digging() {
		System.out.println("cat8");
	}

	public void playing() {
		System.out.println("cat9");
	}

	public void sniffing() {
		System.out.println("cat10");

	}
}
