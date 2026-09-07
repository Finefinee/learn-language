package amiddle.programmers;

public class Solution2 {

    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(charArray1[i]);
            answer.append(charArray2[i]);
        }

        return answer.toString();
    }
}
