package com.greatlearning.question2.services;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DenominationService {
	Scanner sc = new Scanner(System.in);

	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			// mid
			int mid = (left + right) / 2;
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			merge(notes, left, mid, right);
		}
	}

	private void merge(int[] notes, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		for (int i = 0; i < n1; i++)
			leftArray[i] = notes[left + i];

		for (int i = 0; i < n2; i++)
			rightArray[i] = notes[mid + 1 + i];

		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				notes[k] = leftArray[i];
				i++;
			} else {
				notes[k] = rightArray[j];
				j++;
			}

			k++;
		}

		while (i < n1) {
			notes[k] = leftArray[i];
			i++;
			k++;
		}
	}

	public void getCurrencyDenominations(int[] arr, int size) {
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i <= size - 1; i++) {
			arr[i] = sc.nextInt();

		}

	}

	public void calculateMinNotes(int[] arr, int size, int amt) {
		int count;
		if(amt == 0) {
			System.out.println("Amount entered should be greater than 0");
			System.exit(0);
		}
		// Find the minimum no. of notes required
		HashMap<Integer, Integer> hmap = new LinkedHashMap<>();
		try {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (amt >= arr[i]) {
				count = amt / arr[i];
				hmap.put(arr[i], count);
				amt = amt % arr[i];
				
			}
			if(amt == 0) break;

		}
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
			System.exit(0);
		}
		if (amt != 0)
			System.out.println("Amount is not accepted for the given denominations.");

		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (Map.Entry m : hmap.entrySet()) {
				System.out.println(m.getKey() + ":" + m.getValue());
			}

		}

	}
}
