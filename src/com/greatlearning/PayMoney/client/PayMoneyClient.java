package com.greatlearning.PayMoney.client;

import com.greatlearning.PayMoney.service.PayMoneyTransactions;

import java.util.Scanner;

public class PayMoneyClient {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // size of transaction array
        System.out.println("Enter the size of transaction array ");
        int size_of_TransactionArray = sc.nextInt();

        // Enter the values of array
        System.out.println("Enter the values of array ");
        int[] arr = new int[size_of_TransactionArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // No of targets that needs to be achieved
        System.out.println("Enter the total no of targets that needs to be achieved ");
        int no_of_targets = sc.nextInt();

        // values of target
        int[] target = new int[no_of_targets];
        PayMoneyTransactions obj1 = new PayMoneyTransactions();

        //check for target
        for (int j = 0; j < no_of_targets; j++) {
            System.out.println("Enter the value of target ");
            target[j] = sc.nextInt();
            int iterations = obj1.checkForTarget(arr, target[j]);
            if (iterations != -1) {
                System.out.println("Target " + target[j] + " Achieved after " + iterations + " iterations");
            } else {
                System.out.println("Target " + target[j] + " not achieved");
            }
        }

        sc.close();
    }
}