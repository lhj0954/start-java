package ClassAndObject;

import java.util.Scanner;

/*class StaticMember {
    int n;                              //non-statick
    void g() {}                     //non statick(instance member)

    static int m;                   //statick(class member)
    static void f() {}

}*/

class CurrencyConverter {
    private static double rate;
    public static double toDollar(double won) {
        return won/rate;
    }
    public static double toWon(double dollar) {
        return dollar*rate;
    }
    public static void  setRate(double r) {
        rate = r;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("환율(1달러)>>");
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
        System.out.println("$100는"+CurrencyConverter.toWon(100)+"원입니다");
        scanner.close();
    }
}