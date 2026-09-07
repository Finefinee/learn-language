package amiddle.interface1;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }

    @Override
    public void introduce() {
        System.out.println("난 고양이. 눈은 " + DEFAULT_EYE_COUNT + "개.");
        System.out.println("독립적 성격 보유.");
    }
}
