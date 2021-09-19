package com.greatlearning.question2.main;

import java.util.Scanner;

import com.greatlearning.question2.services.DenominationService;
public class Denominations {

	public static void main(String[] args) {
		DenominationService denominationService = new DenominationService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");

		int size_ofcurrency = sc.nextInt();
		int arr[] = new int[size_ofcurrency];
				
		denominationService.getCurrencyDenominations(arr, size_ofcurrency);
		
		denominationService.sort(arr, 0, size_ofcurrency-1);

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		denominationService.calculateMinNotes(arr, size_ofcurrency, amount);
		sc.close();
	}

	}


