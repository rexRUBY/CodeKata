import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] card = new int[n];
        for(int i=0; i<n; i++)
            card[i]=sc.nextInt();

        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++)
            arr[i]=sc.nextInt();
        Arrays.sort(card);
        for(int i=0; i<m; i++)
        {
            if(binarySearch(card,arr[i]))
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
    static boolean binarySearch(int[] arr, int key){
        int first=0;
        int mid;
        int last=arr.length-1;

        while(first<=last){
            mid=(first+last)/2;
            if(arr[mid]==key){
                return true;
            }
            else
            {
                if(key>arr[mid])
                    first=mid+1;
                else
                    last=mid-1;
            }
        }
        return false;
    }
}