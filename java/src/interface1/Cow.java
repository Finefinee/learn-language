package amiddle.interface1;

public class Cow implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }

    @Override
    public void introduce() {
        System.out.println("난 소. 눈은 " + DEFAULT_EYE_COUNT + "개.");
        System.out.println("온순하고 힘이 셈.");
    }
}
