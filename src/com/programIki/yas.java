package com.programIki;

import java.util.Scanner;

public class yas {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do�um y�l�n�z nedir");
		int yas=yasHesapla(2001);
		
		
		System.out.println(yas);
	}
	static int yasHesapla(int dogumYili) {
		return 2019-dogumYili;
}}
