
import java.io.*;
public class S01_P01_isPrime{
    
    public static void main(String arg[]) throws Exception
    {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number : ");
        int n = Integer.parseInt(br.readLine());

        // n = 9
        // 2,....9

        boolean f = true;
        for(int i=2;i<(int)n/2;i++)
        {
            if(n%i==0)
            {
                f = false;
                break;
            }

        }

        if(f)
            System.out.println(n+" is Prime");
        else
            System.out.println(n+" is !Prime");

    }

}

/* 
H.W
W.A.P to find factors of given number 
for num = 40

40 : 2x2x2x5

 */