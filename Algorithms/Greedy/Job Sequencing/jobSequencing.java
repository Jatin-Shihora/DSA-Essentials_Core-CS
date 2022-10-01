// This is Job Sequencing Problem using Greedy Method 

import java.util.*;

public class jobSequencing
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Jobs");
    int n=sc.nextInt();
    String a[]=new String[n];
    int b[]=new int[n];
    int c[]=new int[n];
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter the Jobs");
      a[i]=sc.next();
      System.out.println("Enter the Profit");
      b[i]=sc.nextInt();
      System.out.println("Enter the DeadLine");
      c[i]=sc.nextInt();
    }
    System.out.println("\n--Arranged Order--\n");  // printing taken input
    System.out.print("Jobs:    ");
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.print("Profit:  ");
    for(int i=0;i<n;i++)
    {
      System.out.print(b[i]+" ");
    }
    System.out.println();
    System.out.print("DeadLine:");
    for(int i=0;i<n;i++)
    {
      System.out.print(c[i]+" ");
    }
    for(int i=0;i<n-1;i++)                  // sorting
    {
      for(int j=i+1;j<n;j++)
      {
          if(b[i]<b[j])
          {
              int temp=b[i];               // sorting profit
              b[i]=b[j];
               b[j]=temp;

              temp=c[i];                   // sorting deadline
              c[i]=c[j];
               c[j]=temp;

              String temp1=a[i];           // sorting job
              a[i]=a[j];
               a[j]=temp1;
          }
      }
    }
    System.out.println();
    System.out.println("\n--Sorted Order--\n");  // printing sorted order
    System.out.print("Jobs:    ");
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.print("Profit:  ");
    for(int i=0;i<n;i++)
    {
      System.out.print(b[i]+" ");
    }
    System.out.println();
    System.out.print("DeadLine:");
    for(int i=0;i<n;i++)
    {
      System.out.print(c[i]+" ");
    }
    System.out.println();
    
    int max=c[0];                     // calculating max deadline
    for(int i=0;i<n;i++)
    {
      if(c[i]>max)
      {
        max=c[i];
      }
    }
    String x[]=new String[max];
    int m[]=new int[max];
    int profit=0;
    for(int i=0;i<n;i++)
    {
      int k=c[i];
      k=k-1;
      if(x[k]==null )
      {
        x[k]=a[i];
        profit+=b[i];
      }
      else
      {
        while(k!=-1)
        {
          if(x[k]==null)
          {
            x[k]=a[i];
            profit+=b[i];
            break;
          }
            k=k-1;
        }
      }
    }
    System.out.println();
    System.out.println("Following is the Maximum Profit Sequence of Jobs");           // printing sequence of jobs
    for(int i=0;i<max;i++)
    {
        System.out.print(x[i]);
        if(i<max-1) {
        	System.out.print("-->");
        }
        
    }
    System.out.println("\n");
    System.out.print("Profit Earned "+profit);        // printing total profit
 }
}