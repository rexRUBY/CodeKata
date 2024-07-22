import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] arr = new int[cnt];

        for (int i=0; i<arr.length; i++)
        {
            arr[i]=scanner.nextInt();
        }

        int tmp;
        Arrays.sort(arr);
        int[] nArr = new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                nArr[j++]=arr[i];
            }
        }
        nArr[j++]=arr[arr.length-1];
        for(int i=0; i<j; i++)
            System.out.println(nArr[i]);
    }
}