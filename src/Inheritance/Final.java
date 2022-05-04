package Inheritance;
/*

final class FinalClass {}
class  Subclass extends FinalClass {} // 컴파일 오류

public class SuperClass {
    protected  final int finalMethod() {}
}
class Subclass extends SuperClass {
    protected int finalMethod() {} //컴파일 오류 오버라이딩 안됨
}

public class FinalFieldClass{
    final int rows = 10;
    void f() {
        int[] intArray = new int[rows];
        rows = 30; //컴파일 오류 final 상수값은 변경할 수 없다.
    }
}*/
