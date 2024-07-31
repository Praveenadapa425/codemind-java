import java.util.*;
public class HoursAndMinutes
{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int h=n/60,m=n%60;
        System.out.println(h +" Hour(s) "+m +" Minute(s)");
    }
}