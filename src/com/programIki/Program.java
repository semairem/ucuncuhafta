package com.programIki;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("l�tfen birinci say�y� giriniz");
		int sayi1=scanner.nextInt();
		System.out.println("l�tfen ikinci say�y� giriniz");
		int sayi2=scanner.nextInt();
		matematikIslemleri islem=new matematikIslemleri();
		
		System.out.print("Toplama i�lemi i�in 1 de�erine bas�n�z.\n��karma i�lemi i�in 2 de�erine bas�n�z.\n"+
		"�arpma i�lemi i�in 3 de�erine bas�n�z.\nB�lme i�lemi i�in 4 de�erine bas�n�z.\n");
		int klavyedenGirilenDeger = scanner.nextInt();
		if(klavyedenGirilenDeger==1) {
			System.out.println("cevab�n�z "+islem.toplama(sayi1, sayi2));
		}
		else if(klavyedenGirilenDeger ==2) {
			System.out.println("cevab�n�z "+islem.c�karma(sayi1, sayi2));
		}
		else if(klavyedenGirilenDeger ==3) {
			System.out.println("cevab�n�z "+islem.carpma(sayi1, sayi2));
		}
		else if(klavyedenGirilenDeger ==4) {
			System.out.println("cevab�n�z "+islem.bolme(sayi1, sayi2));
		}
		else
			System.out.println("Girdi�iniz rakam bulunamad�.");
		
	}

}
