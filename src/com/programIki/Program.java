package com.programIki;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen birinci sayýyý giriniz");
		int sayi1=scanner.nextInt();
		System.out.println("lütfen ikinci sayýyý giriniz");
		int sayi2=scanner.nextInt();
		matematikIslemleri islem=new matematikIslemleri();
		
		System.out.print("Toplama iþlemi için 1 deðerine basýnýz.\nÇýkarma iþlemi için 2 deðerine basýnýz.\n"+
		"Çarpma iþlemi için 3 deðerine basýnýz.\nBölme iþlemi için 4 deðerine basýnýz.\n");
		int klavyedenGirilenDeger = scanner.nextInt();
		if(klavyedenGirilenDeger==1) {
			System.out.println("cevabýnýz "+islem.toplama(sayi1, sayi2));
		}
		else if(klavyedenGirilenDeger ==2) {
			System.out.println("cevabýnýz "+islem.cýkarma(sayi1, sayi2));
		}
		else if(klavyedenGirilenDeger ==3) {
			System.out.println("cevabýnýz "+islem.carpma(sayi1, sayi2));
		}
		else if(klavyedenGirilenDeger ==4) {
			System.out.println("cevabýnýz "+islem.bolme(sayi1, sayi2));
		}
		else
			System.out.println("Girdiðiniz rakam bulunamadý.");
		
	}

}
