import java.util.Scanner;
class factorialn
{
 public static void main(String[] args)
 {
   try
   {
    int n,fact=1,i;
    Scanner s= new Scanner(System.in);
    System.out.print(" enter the number : ");
    n= s.nextInt();
    if(n<=0)
    {
       System.out.print("enter only positive numbers");
    }
    else
    {
        for(i=1;i<=n;i++)
         {
              fact=fact*i;
          }
        System.out.print("the factorial of "+n+" is "+fact); 
    } 
    }
    catch(Exception e)
    {
        System.out.print("enter only numbers");
    }
  }
}
