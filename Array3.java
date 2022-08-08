
//Display 2D array from matrix

import java.io.*;     
import java.util.*;

class Array4
{
 public static void main(String arg[])throws IOException
    {
       // Scanner sobj=new Scanner(System.in);
        //System.out.println("Enter the number of rows:");
        //int row=sobj.nextInt();

       // System.out.println("Enter the number of columns:");
       // int col=sobj. nextInt();

        int x[][]=new int[2][3];

         
        
        System.out.println("In matrix form:");
        for(int i=0;i<2;i++)     //outer loop represent row
        {
             for(int j=0;j<3;j++)   //inner loop represent column
             {
                System.out.print(x[i][j]+" ");
             }
             System.out.println();
        }
    }
}



      