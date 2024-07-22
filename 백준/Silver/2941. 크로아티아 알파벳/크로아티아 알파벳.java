import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = scanner.nextLine();
        for(int i=0; i<word.length; i++)
        {
            if(str.contains(word[i]))
                str=str.replace(word[i],"$");
        }
        System.out.println(str.length());
    }
}