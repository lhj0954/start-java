package LoopAndException;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 5개 입력");
        int sum = 0;
        for (int i=0; i < 5; i++) {
            int n = scanner.nextInt(); //키보드에서 정수 입력
            if (n<=0)
                continue;
            else
                sum += n;
        }
        System.out.println("양수의 합은 : " + sum);

        scanner.close();
    }
}
