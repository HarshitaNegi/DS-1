import java.util.*;
class Reverse 
{
  public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);
    int n,i,j,max=0,k=0,n1;
    System.out.println("enter the size of array");
    n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(i=0,j=n-1;i<n/2;i++,j--)
    {
      arr[i]=arr[i]^arr[j];
      arr[j]=arr[i]^arr[j];
      arr[i]=arr[i]^arr[j];
    }
System.out.println("Reversed array is:");
    for(i=0;i<n;i++)
    {
      System.out.print(" "+arr[i]);
    }
    
  }
}