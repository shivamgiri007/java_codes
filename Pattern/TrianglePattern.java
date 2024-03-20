import java.util.*;
import java.lang.*;
import java.io.*;

class TrianglePattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a = 20;
		for(int i=0;i<a;i++){
		    int space = 0;
		    for(int j = 0;j<3;j++){
		        if(space == 0){
		            System.out.println("*");
		            space++;
		        }
		        else if(space == 1){
		            System.out.println(" *");
		            space++;
		        }
		        else if(space == 2){
		            System.out.println("  *");
		            space = 0;
		        }
		    }
		    System.out.println(" *");
		    i+=3;
		  //  System.out.print(" *");
		}

	}
}
