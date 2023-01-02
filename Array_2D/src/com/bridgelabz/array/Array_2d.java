package com.bridgelabz.array;
import java.util.*;

public class Array_2d {

	public static void main(String[] args) {
		
		int [][] arr = new int [10][10];
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter the rows: ");
		int row = sc.nextInt();
		
		System.out.println(" Enter the column: ");
		int column = sc.nextInt();
		
		System.out.println(" Enter " + (row * column) + " array elements");
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < column; j++ ) {
				arr [i][j] = sc.nextInt();
			}
		}
		System.out.println("Array is: \n");
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < column; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
