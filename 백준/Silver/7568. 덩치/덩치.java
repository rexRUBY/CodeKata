import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rank;
        int tst = scanner.nextInt();
        int[][] size = new int[tst][2];

        for(int i=0; i<tst; i++)
        {
            size[i][0]=scanner.nextInt(); //몸무게
            size[i][1]=scanner.nextInt(); //키
        }

        for(int i=0; i<tst; i++)
        {
            rank=1;
            for (int j=0; j<tst; j++)
            {
                if(i==j)
                    continue;
                if(size[i][0]<size[j][0] && size[i][1]<size[j][1])
                    rank++;
            }
            System.out.println(rank);
        }
    }
}