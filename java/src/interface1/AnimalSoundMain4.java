package amiddle.interface1;

public class AnimalSoundMain4 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Pig pig = new Pig();
        InterfaceAnimal[] animals = {dog, cat, cow, pig};
        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 끝");
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }
}
