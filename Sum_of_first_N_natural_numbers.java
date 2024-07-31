import java.util.*;
public class nNatural
{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}