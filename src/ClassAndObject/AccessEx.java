package ClassAndObject;

class Sample {
    public int a;      //퍼블릭
    private int b;   //프라이빗
    int c;                //디폴트
}

public class AccessEx {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 10;
        /*sample.b = 10;*/    //프라이빗 값이기 때문에 한 샘플 클래스에서만 접근 할 수 있다.
        sample.c = 10;
    }
}
