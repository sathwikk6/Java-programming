import java.util.*;
class Main1
{
    public static void main(String[] args)
    {
        int arr[]={12,25,30};
        int lcm=arr[0];
        int gcd=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            gcd=findGCD(arr[i],lcm);
            lcm=(lcm*arr[i])/gcd;
        }
        System.out.println("gcd is"+gcd);
        System.out.println("lcm is"+lcm);
    }
    public static int findGCD(int a,int b)
    {
        if(b==0)
        return a;
        return findGCD(b,a%b);
    }
}