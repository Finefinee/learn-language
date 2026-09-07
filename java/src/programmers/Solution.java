package amiddle.programmers;

class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        int endIdx = s + overwrite_string.length();
        String after = my_string.substring(endIdx);
        return before + overwrite_string + after;
    }

    public static void main(String[] args) {
        String solution = solution("He11oWor1d", "lloWorl", 2);
        System.out.println(solution);
    }
}