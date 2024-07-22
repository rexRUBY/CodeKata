import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        //string1 > string2인 경우: 양의 정수 반환
        //string1 < string2인 경우: 음의 정수 반환
        //string1 == string2인 경우: 0 반환
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });


        System.out.println(str[0]);

        for (int i = 1; i < n; i++) {
            // 중복되지 않는 단어만 출력
            if (!str[i].equals(str[i - 1])) {
                System.out.println(str[i]);
            }
        }
    }
}
