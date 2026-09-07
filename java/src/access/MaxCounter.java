package amiddle.access;

public class MaxCounter {
    private int max;
    private int count = 0;
    public MaxCounter(int max){
        this.max = max;
    }
    public void increment() {
        if (max <= count) {
            System.out.println("최댓값을 초과할 수 없습니다.");
        } else {
            count ++;
        }
    }
    public int getCount() {
        return count;
    }
}
