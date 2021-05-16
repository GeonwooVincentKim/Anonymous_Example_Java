package chap09.AnonymousObject;

class AAA {
    public int a = 10;

    public void check() {
        System.out.println("a : " + this.a);
    }
}

class BBB extends AAA {
    public int b = 20;

    @Override
    public void check() {
        System.out.println("b : " + this.b);
    }
}

class CCC {
    public AAA a1;
    public AAA a2;
    public AAA a3;

    public CCC() {
        this.a1 = new AAA();
    }
}

public class TestChild {

    CCC c = new CCC();
}