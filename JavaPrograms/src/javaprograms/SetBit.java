package javaprograms;

import java.util.Scanner;

public class SetBit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int count=0;
		while(n>0)
		{
			n=n&(n-1);
			count++;
		}
		System.out.print("Setbit of "+t+" is: "+count);

	}

}
