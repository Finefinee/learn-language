package amiddle.interface1;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }

    @Override
    public void introduce() {
        System.out.println("난 개. 눈은 " + DEFAULT_EYE_COUNT + "개.");
        System.out.println("충성심 있음. 사람 좋아함.");
    }
}
