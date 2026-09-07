//package afinal.trycatchfinally.ex1;
//
//public class TryWithResource2 {
//    public static void main(String[] args) {
//        A a1 = null;
//        try {
//            a1 = new A("파일");
//        } catch (Exception e) {
//            System.out.println("예외 처리");
//        } finally {
//            if (a1.resource != null) {
//                try {
//                    a1.close();
//                } catch (Exception e) {
//
//                }
//            }
//        }
//
//        try (A a2 = new A("다른 파일");) {
//
//        } catch (Exception e) {
//            System.out.println("예외 처리");
//        }
//    }
//}
