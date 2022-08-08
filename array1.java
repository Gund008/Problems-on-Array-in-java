import java.io.*;     
import java.util.*;

class array1
{
public static void main(String arg[])  
{
    try
    {
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));   
      
      System.out.println("How many subjects:");
      int n=Integer.parseInt(br.readLine()); 

      int []marks=new int[n];    

      for(int i=0;i<n;i++)
      {
        System.out.println("Enter marks:");
        marks[i]=Integer.parseInt(br.readLine());  
      }
      int tot=0;
      for(int i=0;i<n;i++)
      tot+=marks[i];    //( total=total+marks[i])
      
      System.out.println("Total marks="+tot);

      float percentage=(float)tot/n;  
      System.out.println("percentage="+ percentage);
    }
      catch(IOException obj)
      {
        System.out.println(obj);
      }
    }
}
