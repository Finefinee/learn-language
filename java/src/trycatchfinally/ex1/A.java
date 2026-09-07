package afinal.trycatchfinally.ex1;

class A {
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외메세지: MyException");

    MyException mre1 = new MyException();
    MyException mre2 = new MyException("예외메세지: MyRException");

    void abc_1(int num) {
        try {
            if (num > 70) {
                System.out.println("정상 작동");
            } else {
                throw me1;
            }
        } catch (MyException e) {
            System.out.println("예외처리 1");
        }
    }

    void bcd_1() {
        abc_1(65);
    }

    void cde_1() {
//        throw mre1;
    }

    void abc_2(int num) throws MyException {
        if (num > 70) {
            System.out.println("정상 작동");
        } else {
            throw me1;
        }
    }

    void bcd_2() {
        try {
            abc_2(65);
        } catch (MyException e) {
            System.out.println("예외처리 2");
        }
    }

    void checkScore(int score) throws MinusException, OverException {
        if (score < 0) {
            throw new MinusException("예외 발생: 음수 값 입력");
        } else if (score > 100) {
            throw new OverException("예외 발생: 100점 초과");
        }  else {
            System.out.println("정상적인 값");
        }
    }

}

class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}
