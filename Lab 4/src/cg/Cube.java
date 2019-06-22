package cg;

import java.util.Scanner;

public class Cube {

	public static int getCubeOfDigit(int n) {
		int temp=n;
		int d, sum=0;
		while(temp>0) {
			d=temp%10;
			temp=temp/10;
			sum+=Math.pow(d, 3);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int c=getCubeOfDigit(n);
		System.out.println("Cube of digits of "+n+" is "+c);
		sc.close();

	}

}
