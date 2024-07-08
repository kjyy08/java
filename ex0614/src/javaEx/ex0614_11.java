package javaEx;

import java.util.HashMap;
import java.util.Iterator;

public class ex0614_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> cats = new HashMap<Integer, String>();

		cats.put(1, "페르시안");
		cats.put(2, "샴");
		System.out.println(cats);

		cats.put(3, "러시안블루");
		System.out.println(cats);

		cats.replace(3, "래그돌");
		System.out.println(cats);

		cats.remove(1);
		System.out.println(cats);

		System.out.println(cats.size());
		System.out.println(cats.get(2));

		System.out.print("(Key, Value) =");
		Iterator<Integer> keys = cats.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ") ");
		}
		
		String textStr = "hsdfs fsdf sfdjkasf sfa asfda fa ";
		String[] token = textStr.split(" ");
	}

}
