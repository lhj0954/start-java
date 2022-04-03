package LoopAndException;

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        System.out.println("정수입력을 마치려면 -1을 입력하세요");
        System.out.print("정수를 입력해 주세용~");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (n != -1) {
            sum += n;
            count++;

            n = scanner.nextInt();
        }
        if (count == 0) {
            System.out.print("입력된 수가 없습니다.");
        } else {
            System.out.println("정수의 개수는"+count+"개이며");
            System.out.print("평균은" + (double) sum / count + "입니다.");
        }
    }
}
