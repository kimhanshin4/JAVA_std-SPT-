package Practice.Prac1.Carr.instanceofSample;

// 다형성

class Parent { }
class Child extends Parent { }
class Brother extends Parent { }


public class Main {
    public static void main(String[] args) {

        Parent pc = new Child();  // 다형성 허용 (자식 -> 부모)

        Parent p = new Parent();

        System.out.println(p instanceof Object); // true 출력
        System.out.println(p instanceof Parent); // true 출력
        System.out.println(p instanceof Child);  // false 출력

        Parent c = new Child();

        System.out.println(c instanceof Object); // true 출력
        System.out.println(c instanceof Parent); // true 출력
        System.out.println(c instanceof Child);  // true 출력

    }
}