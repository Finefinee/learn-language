package exceptionex;

public class Developer implements Runnable {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("커피 수혈 중");
                Thread.sleep(1000);

                System.out.println("피폐한 상태로 개발 중");
                Thread.sleep(2000);

                System.out.println("1시간 취침");
                Thread.sleep(1500);

                System.out.println("-------------------------");
            }
        } catch (InterruptedException e) {
            System.err.println("개발자가 과로로 퇴사했습니다.");
        }
    }

    public static void main(String[] args) {
        Developer pipayDeveloper = new Developer("김연호");
        pipayDeveloper.run();
    }
}