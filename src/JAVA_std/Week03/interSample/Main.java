package JAVA_std.Week03.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();
        a1.a();
        // a1.b(); // 불가능
        // a1은 인터페이스 A타입(자동 형변환) => a() 메서드만 가지고 있음

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1; //b(); 를 사용하기 위한 B타입으로의 강제 타입 변환
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C(); //본디 C타입은 a,b,c모두를 가지고 있었지만, A타입으로 형변환 함에 따라 a밖에 가지지 못함
        a2.a();
        //a2.b(); // 불가능
        //a2.c(); // 불가능

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2; // 위에서 b,c를 가져오는게 막혔지만 a2를 C타입으로 다시 변환 시키므로 b,c를 가져오는게 가능
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}
class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}