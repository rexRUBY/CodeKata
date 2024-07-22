import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strToChar = new char[str.length()];
        strToChar=str.toCharArray();
        Arrays.sort(strToChar);
        for(int i=strToChar.length-1; i>=0; i--)
            System.out.print(strToChar[i]);
    }
}