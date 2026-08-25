package sdetprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
			int arm=0,a,b,c,d,number;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of terms");
			number=sc.nextInt();
			d=number;
			while(number>0)
			{
				a=number%10;
				number=number/10;
				arm=arm+a*a*a;
			}
			if(arm==d) {
				System.out.println("Armstrong number");
			}
			else
			{
				System.out.println("not armstrong number");
			}

	}

}
