class Solution {
    public String solution(String s) {
        StringBuilder rs = new StringBuilder();
        boolean newWord = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                newWord = true;
                rs.append(c);
            } else if (newWord) {
                rs.append(Character.toUpperCase(c));
                newWord = false;
            } else {
                rs.append(Character.toLowerCase(c));
            }
        }

        return rs.toString();
    }
}