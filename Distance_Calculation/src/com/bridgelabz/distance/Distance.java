package com.bridgelabz.distance;
import java.util.*;
public class Distance {
	
	static  void calculate( int x ,int y) {
	System.out.println("Distance is: " + (Math.pow((x*x +y*y), 0.5)));
	
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
	System.out.println(" Enter the value of x: ");
	int x = sc.nextInt();
		
	System.out.println(" Enter the value of y: ");
	int y = sc.nextInt();
	
	calculate( x, y );	
	}
}