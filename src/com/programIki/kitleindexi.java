package com.programIki;

import java.util.Scanner;

public class kitleindexi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("boyunuzu giriniz");
		double boy=scanner.nextDouble();
		System.out.println("kilonuzu giriniz");
		double kilo=scanner.nextDouble();
		double index2 =indexHesaplama(kilo,boy);
		System.out.println(index2);
	}
	static double indexHesaplama(double kilo,double boy) {
		
		return kilo/(boy*boy);
		
	}
}
