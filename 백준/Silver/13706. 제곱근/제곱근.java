import java.util.*;
import java.math.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        BigInteger num =new BigInteger("0");
        num = scanner.nextBigInteger();
        System.out.println(num.sqrt());
    }
}