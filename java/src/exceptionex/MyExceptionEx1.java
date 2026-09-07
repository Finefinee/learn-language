package exceptionex;

public class MyExceptionEx1 extends RuntimeException {

    private final int ERR_CODE = 500;
    private final String[] errors;

    public MyExceptionEx1(String message, String[] errors) {
        super(message);
        this.errors = errors;
    }

    public int  getERR_CODE() {
        return ERR_CODE;
    }

    public String[] getERRORS() {
        return errors;
    }

    public String getERR_MESSAGE() {
        return super.getMessage();
    }

    public void printErrors() {
        for (String error : errors) {
            System.out.println(error);
        }
    }

    public static void main(String[] args) {
        MyExceptionEx1 e = new MyExceptionEx1("에러 메세지", new String[]{"..는 필수 입력", "..는 필수 입력"});
        e.printErrors();
    }
}
