package lect0531;

public class Dog extends Animal1 implements Animal2 {
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("������");
		age = 20;
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("�۸�");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���� ������");
	}
}
