package com.semairem;

import java.util.Random;

public class Faktoriyel {

	int faktoriyel() {
		// TODO Auto-generated method stub
		Random rastgeleSayiFaktoriyel=new Random();
		int uretilecekSayi=rastgeleSayiFaktoriyel.nextInt(5);
		int faktoriyelSonuc=1;
		System.out.println("fakt�riyel i�in �retilen rastgele say� "+uretilecekSayi);
		for (int i = 1; i <= uretilecekSayi; i++) {
			faktoriyelSonuc= faktoriyelSonuc*i;
		}
		System.out.println("faktoriyelin cevab� "+faktoriyelSonuc);
		return faktoriyelSonuc;
	}

}
