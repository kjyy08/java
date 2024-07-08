package lect0531;

public class SmartPhone extends Animal implements Phone,Phone2 {
	String ostype;
	String osversion;
	int    memorySize;
	boolean isCamera;
	boolean isBluetooth;
	
	@Override
	public void receive_call() {
		// TODO Auto-generated method stub
		System.out.println("receive smartphone call");
	}
	@Override
	public void send_call() {
		// TODO Auto-generated method stub
		System.out.println("send smartphone call");
	}
	@Override
	public void send_call2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void receive_call2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void sound() {
		// TODO Auto-generated method stub
		
	}
	
}
