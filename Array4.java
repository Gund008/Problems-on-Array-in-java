
//Display 2D array from matrix

import java.io.*;     
import java.util.*;

class Array4
{
 public static void main(String arg[])throws IOException
    {
       Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=sobj.nextInt();

       System.out.println("Enter the number of columns:");
       int col=sobj. nextInt();

       int Arr[][]=new int[row][col];

       System.out.println("In matrix form element:");
        for(int i=0;i<row;i++)     //outer loop represent row
        {
             for(int j=0;j<col;j++)   //inner loop represent column
             {
               Arr[i][j]=sobj.nextInt();
             }
             //System.out.println();
        }
        
        System.out.println("element of  matrix:");
        for(int i=0;i<row;i++)     //outer loop represent row
        {
             for(int j=0;j<col;j++)   //inner loop represent column
             {
                System.out.print(Arr[i][j]+" ");
             }
             System.out.println();
        }

          System.out.println("the transpose matrix:");
        for(int i=0;i<col;i++)     //outer loop represent row
        {
             for(int j=0;j<row;j++)   //inner loop represent column
             {
                System.out.print(Arr[j][i]+" ");
             }
             System.out.println();
        }

        
    }
}



      