import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll("XXXX","AAAA");
        str=str.replace("XX","BB");
        if(str.contains("X"))
            str="-1";
        System.out.println(str);
    }
}