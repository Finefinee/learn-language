package amiddle.memory.ex;

public class Solution {

    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            char current = code.charAt(idx);

            if (current == '1') {
                mode = 1 - mode;
                continue;
            }

            if (mode == 0 && idx % 2 == 0) {
                ret.append(current);
            }

            if (mode == 1 && idx % 2 == 1) {
                ret.append(current);
            }
        }

        if (ret.length() == 0) {
            return "EMPTY";
        }

        return ret.toString();
    }
}
