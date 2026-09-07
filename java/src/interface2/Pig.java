package amiddle.interface2;

import amiddle.abstract2.AbstractAnimal;

public class Pig extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void move() {
        System.out.println("돼지 이동");
    }
}
