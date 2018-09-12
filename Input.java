import java.util.*;
class Input
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    int n,i,j,max=0;
    System.out.println("enter the size of array");
    n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println("max value in array is: "+max);
  }
}