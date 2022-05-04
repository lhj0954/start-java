package LoopAndException;

import java.util.Scanner;

public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (true) {
            System.out.println("나눠질 수를 입력하세용");
            int dividend = scanner.nextInt();
            System.out.println("나눗수를 입력하세용~");
            int divide = scanner.nextInt();
            try {
                System.out.println(dividend/divide);
                break;
            } catch (ArithmeticException e) {
                System.out.println("컴퓨터는 0으로 나눌 줄 몰라 응애!");
            }
        }
        scanner.close();
    }
}
