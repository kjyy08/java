package javaEx;

import java.util.Collections;
import java.util.LinkedList;

public class ex0614_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> num = new LinkedList<Integer>();

		for (int i = 10; i >= 1; i--)
			num.add(i);

		System.out.println(num);

		System.out.print("정렬 전 : ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");

		Collections.sort(num);

		System.out.println();
		System.out.print("정렬 후  : ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");
	}

}
