package com.greatlearning.currencydenominations.service;

public class CurrencyDenominationService {

    public void countCurrency(int[] notes, int amount) {

        int[] noteCounter = new int[notes.length];

        // count notes

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // min no of notes

        System.out.println("Your payment approach in order to give min no of notes will be ");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    public void sort(int[] arr) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < (size - 1 - i); j++) {
                if (arr[j] < arr[j + 1]) {
                    //swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
}
