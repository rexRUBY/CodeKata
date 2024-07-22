import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int cost = scanner.nextInt();
        int[] coin = new int[cost];
        int tmp, cnt=0;

        for(int i=0; i<testcase; i++)
        {
            coin[i]=scanner.nextInt();
        }
        for(int i=testcase-1; i>=0; i--)
        {
            tmp=cost/coin[i];
            cnt+=tmp;
            cost%=coin[i];
        }
        System.out.println(cnt);
    }
}