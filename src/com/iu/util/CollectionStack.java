package com.iu.util;

import java.util.Scanner;


public class CollectionStack implements Collection {
	
	Scanner sc = new Scanner(System.in);
	int [] copys;
//	int num = sc.nextInt();

	@Override
	public int[] add(int[] numbers) {
				
		for(int i=0;i<numbers.length;i++) {
			this.copys[i] = numbers[i];
		}
		
		return this.copys;
	}
	
	
	
	@Override
	public int[] remove(int[] numbers) {
		return null;
	}
	
}
