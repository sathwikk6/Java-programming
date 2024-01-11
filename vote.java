import java.util.*;
class vote
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age ");
        int age=s.nextInt();
        if(age<0)
        {
            System.out.println("invalid input");
        }
        else if(age<18)
        {
            System.out.println("you are not eligible to vote "+(18-age));
        }
        else
        {
            System.out.println("you are eligible to vote");
        }
    }
}