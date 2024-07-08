package lect0531;

public class Dog extends Animal1 implements Animal2 {
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("누워서");
		age = 20;
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("공을 가지고");
	}
}
