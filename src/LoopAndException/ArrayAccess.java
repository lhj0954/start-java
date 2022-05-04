package LoopAndException;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        int intArray [] = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i]=scanner.nextInt();
            if (intArray[i] > max) {
                max=intArray[i];
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
