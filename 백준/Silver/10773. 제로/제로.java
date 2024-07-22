import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0){
                sum-= list.get(list.size()-1);
                list.remove(list.size() - 1);
            }
            else {
                list.add(tmp);
                sum += tmp;
            }
        }
        System.out.println(sum);
    }
}