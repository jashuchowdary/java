import java.util.Scanner;
class fibno
{
 public static void main(String[] args)
 {
   try
   {
    int N,n1=0,n2=1,i,sum=0;
    Scanner s= new Scanner(System.in);
    System.out.print(" enter the number : ");
    N= s.nextInt();
    if(N<=0)
    {
       System.out.print("enter only positive numbers");
    }
    
    else
    {
        System.out.println("the fibonacci series:");
        System.out.print(n1+"\t");
        System.out.print(n2+"\t");
        for(i=2;i<N;i++)
         {
              
              sum=n1+n2;
              System.out.print(sum+"\t");
              n1=n2;
              n2=sum;
          }
        
    }
    
    
    
    }
    catch(Exception e)
    {
        System.out.print("enter only numbers");
    }
  }
}fibno.java
