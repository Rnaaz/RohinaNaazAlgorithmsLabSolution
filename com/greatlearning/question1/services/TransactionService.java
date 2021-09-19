package com.greatlearning.question1.services;

import java.util.Scanner;

public class TransactionService {
	Scanner sc = new Scanner(System.in);

	public void get_values_of_array(int[] arr, int size) {
		System.out.println("Enter the values of array");
		for (int i = 0; i <= size - 1; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public int calculate_target(int[] arr, int target) {
		int sum = 0;
		for (int j = 0; j <= arr.length - 1; j++) {
			sum = sum + arr[j];
			if (target <= sum) {
				return j + 1;
			}
		}
		return -1;
	}
}
