import java.util.*;
class Waveform
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    int a,b,n,i,j=0,max=0,k=-1,n1;
    System.out.println("enter the size of rows and cols of 2d array");
    a=s.nextInt();
    b=s.nextInt();
    int arr[][]=new int[a][b];
    System.out.println("enter elements of array");
    for(i=0;i<a;i++)
    {
      for(j=0;j<b;j++)
      {
        arr[i][j]=s.nextInt();
      }
    }
    for(i=0;i<a;i++)
    {
      if(k==-1)
      {
        for(k=0;k<b;k++)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      else
      {
        for(k=b-1;k>=0;k--)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      
    }
    
  }
}