package amiddle.interface1;

public class Pig implements InterfaceAnimal {
    @Override
    public void introduce() {
        System.out.println("난 돼지. 눈은 " + DEFAULT_EYE_COUNT + "개.");
        System.out.println("똑똑함. 깨끗함.");
    }

    @Override
    public void move() {
        System.out.println("돼지 이동");
    }

    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }
}
