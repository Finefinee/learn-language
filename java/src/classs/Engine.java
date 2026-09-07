package amiddle.classs;

public class Engine {

    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void startEngine() {
        System.out.printf("%s 엔진이 작동됩니다. (마력: %d)", this.type, this.horsepower);
    }

    public void displayEngineInfo() {
        System.out.println("엔진 타입: " + this.type);
        System.out.println("엔진 마력: " + this.horsepower);

    }
}
