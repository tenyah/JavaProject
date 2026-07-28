package com.mnu.exam03;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("단어 : ");
			String word = scn.nextLine();
			word = word.toUpperCase();
			if(word.toUpperCase().equals("END"))
				break;
		}
		int count[] = new int[26];
		
		
		
	}

}
