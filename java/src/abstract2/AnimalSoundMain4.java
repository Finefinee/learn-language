package amiddle.abstract2;

public class AnimalSoundMain4 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Pig pig = new Pig();
        AbstractAnimal[] animals = {dog, cat, cow, pig};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 끝");
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }
}
