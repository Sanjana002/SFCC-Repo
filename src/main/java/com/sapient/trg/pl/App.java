package com.sapient.trg.pl;

/**
 * doc-style commenting
 * @author sangupta27
 * This class demonstrates difference between 
 * static and instance methods.
 * 
 * There is a root class, Object where all classes implicitly extend object class.
 */
public class App {

	//instance method
	public int square(int n) {
		return n*n;
	}
	//static method
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cube of 5 is : " + App.cube(5));
		App app = new App();
		System.out.println("Square of 5 is : " + app.square(5));

	}

}
