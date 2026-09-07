package amiddle.interface2;

import amiddle.abstract2.AbstractAnimal;

public class AnimalSoundMain5 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Pig pig = new Pig();
        Duck duck = new Duck();
        Chicken chicken = new Chicken();
        AbstractAnimal[] animals = {dog, cat, cow, pig, duck, chicken};
        for (AbstractAnimal animal : animals) {
            animalSound(animal);
            animalMove(animal);
            if (animal instanceof Fly flyAnimal) {
                System.out.println("동물 비행 테스트 시작");
                flyAnimal.fly();
                System.out.println("동물 비행 테스트 끝");
            }
        }
    }

    private static void animalMove(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 끝");
    }

    private static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }
}
