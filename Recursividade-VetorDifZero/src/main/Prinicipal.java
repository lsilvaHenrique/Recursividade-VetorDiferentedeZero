package main;

import controller.VetController;

public class Prinicipal {
	
	public static void main(String args[]) {
		VetController multi = new VetController();
		int[] a = {2, 5, 8, 7, 10, 12, 15};
		int n = multi.Vet(a, 7); 
		System.out.println(n);
	}
	
}
