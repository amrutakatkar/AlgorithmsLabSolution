package com.greatlearning.PayMoney.service;

public class PayMoneyTransactions {

    public  int checkForTarget(int[] arr, int target){
        int accumulator =0;
        for(int i=0;i< arr.length;i++){
            accumulator= accumulator + arr[i];
            if(accumulator>= target)
            {
                return (i+1);
            }
        }
        return -1;

    }



}