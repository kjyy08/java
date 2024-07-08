package javaEx;

import java.util.ArrayList;

public class ex0614_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cats = new ArrayList<String>();

		cats.add("페르시안");	//0
		cats.add("null");	//2
		cats.add(1, "샴");	//1
		cats.set(2, "러시안블루");
		System.out.println(cats);
		
//		cats.add("null");
//		System.out.println(cats);
//
//		cats.add(1, "샴");
//		System.out.println(cats);
//
//		cats.set(2, "러시안블루");
//		System.out.println(cats);
//
//		cats.remove("페르시안");
//		System.out.println(cats);
//
		cats.remove(2);
		System.out.println(cats);
//
		System.out.println(cats.size());
		System.out.println(cats.get(1));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
	}

}
