package com.bridgelabz.quadratic;
import java.util.*;

public class Quadratic {

	static void root(int a, int b, int c) {
		
		double delta = (Math.abs(b*b - 4*a*c));
		
		double x1 = (-b + Math.pow(delta,1/2)) / (2*a);
		double x2 = (-b - Math.pow(delta,1/2)) / (2*a);
		
		System.out.println("Root 1 is: " +x1);
		System.out.println("Root 2 is: " +x2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter value a: ");
		int a = sc.nextInt();
		System.out.println(" Enter value b: ");
		int b = sc.nextInt();
		System.out.println(" Enter value c: ");
		int c = sc.nextInt();
		
		root(a,b,c);
	}
}
