package com.programIki;

public class matematikIslemleri {
	int sayac = 0;
	public static int length;

	int toplama(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operat�r " + sayac + " kere kullan�ld�");
		return sayi1 + sayi2;

	}

	int carpma(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operat�r " + sayac + " kere kullan�ld�");
		return sayi1 * sayi2;

	}

	int c�karma(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operat�r " + sayac + " kere kullan�ld�");
		return sayi1 - sayi2;

	}

	int bolme(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operat�r " + sayac + " kere kullan�ld�");
		return sayi1 / sayi2;

	}

}
