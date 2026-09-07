package amiddle.programmers;

public class Solution5 {

    public int solution(int a, int b) {
        String StringA = String.valueOf(a);
        String StringB = String.valueOf(b);
        String StringAnswerAPlusB = StringA + StringB;
        String StringAnswerBPlusA = StringB + StringA;
        int answer = 0;
        answer = Math.max(Integer.parseInt(StringAnswerAPlusB), Integer.parseInt(StringAnswerBPlusA));
        return answer;
    }
}
