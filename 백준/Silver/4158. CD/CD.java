import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0)
                break;

            int[] nArr = new int[n];
            int mArr;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                nArr[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < m; i++) {
                mArr = Integer.parseInt(br.readLine());
                if (binary(nArr, mArr)) cnt++;
            }
            System.out.println(cnt);
//            bw.newLine();
//            bw.write(cnt);
//            bw.flush();
//            bw.close();
        }
    }
    private static boolean binary(int[] n, int m)
    {
        int mid;
        int last=n.length-1;
        int first=0;

        while(first<=last)
        {
            mid=(first+last)/2;
            if(n[mid]==m)
                return true;
            else
            {
                if (m < n[mid])
                    last = mid - 1;
                else
                    first = mid + 1;
            }
        }
        return false;
    }
}