/*-------------Problem Statement---------------------------------------------------------
 * PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They 
also have a daily target that they must achieve. Given a list of transactions done by 
PayMoney and a daily target, your task is to determine at which transaction PayMoney 
achieves the same. If the target is not achievable, then display the target is not achieved.
 */
// Input Array 20 12 31

package com.greatlearning.question1.main;

import java.util.Scanner;

import com.greatlearning.question1.services.TransactionService;

public class Transaction {

	public static void main(String[] args) {
		TransactionService transactionService = new TransactionService();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int size_of_transaction = sc.nextInt();
		int arr[] = new int[size_of_transaction];

		transactionService.get_values_of_array(arr, size_of_transaction);
		System.out.println("Enter the total no of targets that needs to be achieved");
		int no_of_target = sc.nextInt();

		for (int i = no_of_target - 1; i >= 0; i--) {
			System.out.println("Enter the value of target");
			int target_value = sc.nextInt();
			int result = transactionService.calculate_target(arr, target_value);
			if (result == -1)
				System.out.println("Target not achieved");

			else
				System.out.println("Target achieved after " + result + " transactions");
		}
		sc.close();
	}

}
