package amiddle.poly.basic;

import amiddle.poly.a.Child;
import amiddle.poly.a.Parent;

public class CastingMain1 {

    public static void main(String[] args) {

        System.out.println("다운캐스팅");
        Parent poly1 = new Child();
        Child child1 = (Child) poly1;
        child1.childMethod();

        System.out.println("일시적 다운캐스팅");
        Parent poly2 = new Child();
        ((Child) poly2).childMethod();

        System.out.println("업캐스팅");
        Child child2 = new Child();
        Parent parent1 = (Parent) child2;
        Parent parent2 = child2;

    }
}
