/* retriving value from dynamic array*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the number "+(i+1)+"");
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
	}

}
