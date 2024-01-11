import java.util.Scanner;
class Composite_Number
{
   int flag,n,i,j;
   Composite_Number()
     {
       System.out.print("Enter range to find the composite numbers: ");
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       for(i=2;i<=n;i++ )
        {
            flag=0;
           for(j=2;j<i;j++)
             {
                 if(i % j == 0)
                    flag++;
             }
           if(flag!=0)
            System.out.println("one of the composite number is:" + i);
        }
    }
public static void main(String args[])   
      {
           Composite_Number ob=new Composite_Number();
      }
}