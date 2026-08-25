package sdetprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int number=sc.nextInt();
		int first=0,second=1,next;
		System.out.println("Fibbonacci series is");
		for(int i=0;i<=number;i++)
		{
			System.out.println(first+"");
			next=second+first;
			first =second;
			second=next;
		}
		sc.close();
		

	}

}
