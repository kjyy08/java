package lect0531;

abstract public class Animal {
	String name;
	int	   age;
	String gender;
	
	void sleep() {
		System.out.println("sleep");
	}
	void eat() {
		System.out.println("eat");
	}
	abstract void sound();
}
