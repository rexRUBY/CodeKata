class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            char newChar = c;
            for (int i = 0; i < index; i++) {
                do {
                    newChar++;
                    if (newChar > 'z') {
                        newChar = 'a';
                    }
                } while (skip.contains(String.valueOf(newChar)));
            }
            sb.append(newChar);
        }
        return sb.toString();
    }
}