package com.programIki;

public class methodOrnek {
	
	
	public static void main(String[] args) {
		toplaVeEkranaYaz(7, 5);
	
		yazdir(8);
	}
	static void toplaVeEkranaYaz(int sayi1,int sayi2) {
		int  sonuc=sayi1+sayi2;
		System.out.println(sonuc);}
	static void yazdir(int toplam2) {
		
		if(toplam2<10) {
			System.out.println("üzgünüm"+toplam2);
		}
		else {
			System.out.println("tebrikler"+toplam2);
		}
	}
	
	
}
