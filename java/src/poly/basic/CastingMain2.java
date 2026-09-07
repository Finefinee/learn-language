package amiddle.poly.basic;

import amiddle.poly.a.Child;
import amiddle.poly.a.Parent;

public class CastingMain2 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("Parent 호출");
        String result1 = call1(parent1);
        String result2 = call2(parent1);
        compareResult(result1);
        compareResult(result2);

    }

    public static String call1(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.childMethod();
            return "Child 인스턴스 맞음";
        } else {
            return "Child 인스턴스 아님";
        }
    }

    public static String call2(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            child.childMethod();
            return "Child 인스턴스 맞음";
        } else {
            return "Child 인스턴스 아님";
        }
    }

    public static void compareResult(String result) {
        System.out.println(result);
        if (result.equals("Child 인스턴스 맞음")) {
            System.out.println("정확히 Child 인스턴스 맞음");
        }
    }
}
