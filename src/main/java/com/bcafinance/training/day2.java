package com.bcafinance.training;

import java.util.Random;

/*
@Author Azim a.k.a. Rahmad Nur Azim
Principle Architect
Created with Eclipse version 4.25.0
Created on 08-11-2022 10:23:29
Last Modified on 08-11-2022 10:23:29
Version 1.0
*/

public class day2 {
	public static void main(String[] args) {
		
		String strA = "Tb@14XzM i";
		char[] charA = strA.toCharArray();
		//System.out.println(charA[7]);
		
		Random ran = new Random();
		int intB = 0;
		char chY;
		String strB ="";
		/*
		for(int i=0; i<strA.length(); i++) {
			if(charA[i]>=65 && charA[i]<=90 ||
					charA[i]>=97 && charA[i]<=122 ||
					charA[i]>=48 && charA[i]<=57) {
				intB += charA[i];
			}
			
		}*/
		for(int i=0; i<9; i++) {
			if(i<3) {
				chY = (char) ran.nextInt(65,91);
				strB = strB+chY;
				//System.out.println(strB);
			}else if(i<6) {
				chY = (char) ran.nextInt(97,123);
				strB = strB+chY;
				//System.out.println(strB);
			}else {
				chY = (char) ran.nextInt(48,58);
				strB = strB+chY;
				//System.out.println(strB);
			}
		}
		
		System.out.println(strB);
		
	}
	

}
