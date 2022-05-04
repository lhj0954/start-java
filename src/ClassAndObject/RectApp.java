package ClassAndObject;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width*height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        rectangle.width= scanner.nextInt();
        rectangle.height= scanner.nextInt();
        System.out.println(rectangle.getArea());
        scanner.close();
    }
}
