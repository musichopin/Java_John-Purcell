﻿class Frog {

	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// all objects have object class/class object as their ultimate parent/super class
	// Object obj = new Object();
	// obj.toString();

	public String toString() {
		// toString metodu olmasa hashcode (object için) output edilecekti

		return String.format("%-4d: %s", id, name);
		// String.format ile printf("...", x, y) formatında return ederiz

		/*
		 * slightly more efficient way to avoid concatenating:
		 * StringBuilder sb = new StringBuilder(); 
		 * sb.append(id).append(": ").append(name);
		 * 
		 * return sb.toString();
		 */
	}
}

public class Java {

	public static void main(String[] args) {

		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Roger");
		// toString method is inherited from the object class
		// which is secretly the parent/super class of the frog class

		System.out.println(frog1);
		System.out.println(frog2);
		// frog1.toString() dense  veya toString() dışında random metod ("xyz()") yaratıp 
		// frog1.xyz() dense de output değişmezdi. 
		// when we print an object it tries to invoke the string method to get a
		// string representation of the object, which is helpful for debugging

	}
}
/*
7   : Freddy
5   : Roger
*/