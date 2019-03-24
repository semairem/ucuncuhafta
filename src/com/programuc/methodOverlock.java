package com.programuc;

import java.util.Scanner;

public class methodOverlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toplam1= toplam(7,6);
		System.out.println(toplam1);
		int toplam2= topla(10,23,36);
		System.out.println(toplam2);
		int toplam3= topla("12","36");
		System.out.println(toplam3);
		
	}
	static int topla(String sayi1,String sayi2) {
		int sayi11=Integer.parseInt(sayi1);
		// String sayýdan küçük inte dönüþtürüyo.
		int sayi12=Integer.parseInt(sayi2);
		int sonuc=sayi12+sayi11;
		return sonuc;
	}
	static int toplam(int sayi1,int sayi2) {
		
		int sonuc= sayi1+sayi2;
		return sonuc;
		
	}
	static int topla(int sayi1,int sayi2, int sayi3) {
		int sonuc=sayi1+sayi2+sayi3;
		return sonuc;
	}
}