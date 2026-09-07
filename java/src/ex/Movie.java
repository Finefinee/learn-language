package amiddle.ex;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
        System.out.println("- 감독:" + director + ", 배우:" + actor);
    }
}
