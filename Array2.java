
//integer value using bubble sort using java

import java.io.*;     
import java.util.*;

class Array2
{
public static void main(String arg[])throws IOException
    {
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));   
      
      System.out.println("How many subjects:");
      int n=Integer.parseInt(br.readLine()); 

      int []arr=new int[n];     //int []arr;  

      for(int i=0;i<n;i++)
      {
        System.out.println("Enter integrer:");
        arr[i]=Integer.parseInt(br.readLine());
      }

      int Arr=n-1;    //0 to n-1
      boolean flag=false;
      int temp;

      for(int i=0;i<Arr;i++)
      {
         for(int j=0;j<Arr-1;j++)
         {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
         }
         if(flag==false) break;
         else flag =false;
         
     }
       System.out.println("The sorted array is:");
      for(int i=0;i<n;i++)
      System.out.println(arr[i]);
    }
}



      