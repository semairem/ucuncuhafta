package com.programIki;

public class matematikIslemleri {
	int sayac = 0;
	public static int length;

	int toplama(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operatör " + sayac + " kere kullanýldý");
		return sayi1 + sayi2;

	}

	int carpma(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operatör " + sayac + " kere kullanýldý");
		return sayi1 * sayi2;

	}

	int cýkarma(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operatör " + sayac + " kere kullanýldý");
		return sayi1 - sayi2;

	}

	int bolme(int sayi1, int sayi2) {
		sayac++;
		System.out.println("bu operatör " + sayac + " kere kullanýldý");
		return sayi1 / sayi2;

	}

}
