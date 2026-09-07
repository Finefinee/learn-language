package amiddle.programmers;

public class Solution6 {

    public int solution(int a, int b) {
        String StringA = String.valueOf(a);
        String StringB = String.valueOf(b);
        String StringPlusAnswer = StringA + StringB;
        int MultiplyAnswer = 2 * a * b;
        int answer = 0;
        answer = Math.max(Integer.parseInt(StringPlusAnswer), MultiplyAnswer);
        return answer;
    }
}
