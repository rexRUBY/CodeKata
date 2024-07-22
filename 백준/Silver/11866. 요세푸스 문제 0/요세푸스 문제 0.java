import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> lst=new LinkedList<>();
        int n=scanner.nextInt();
        int k=scanner.nextInt();

        for(int i=0; i<n; i++)
            lst.add(i+1);

        System.out.print("<");
        while (!lst.isEmpty())
        {
            for(int i=0; i<k-1; i++)
            {
                lst.add(lst.poll());
            }
            System.out.print(lst.poll());
            if(lst.size()>0)
                System.out.print(", ");
        }
        System.out.print(">");
    }
}