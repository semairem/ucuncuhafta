package com.programIki;

import java.util.Random;
import java.util.Scanner;

public class alfabe {
	public static void main(String[] args) {
		char[] harfDizisi = new char[26];
		
		for (int i = 0; i < 26; i++) {
				harfDizisi[i]=(char)(i+65);
				
		}
		for (int i = 0; i < harfDizisi.length; i++) {
			System.out.println(harfDizisi[i]);
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("kaç jeime ðretilsin");
		int kelimeSayisi=scanner.nextInt();
		
		System.out.println("kaç harfli ðretilsin");
		int harfSayisi=scanner.nextInt();
		
		System.out.println(kelimeSayisi);
		System.out.println(harfSayisi);
		
		String[] ureilenKelimeler=new String[kelimeSayisi];
		for (int i = 0; i < kelimeSayisi; i++) {
			String kelime="";
			for (int j = 0; j < harfSayisi; j++) {
				Random random=new Random();
				char harf =(char) random.nextInt(26);
				
				
				
			}
			
		}
		}

}
