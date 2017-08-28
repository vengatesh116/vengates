import java.io.*;
import java.util.*;

class SnakeSquare {
    
    public static void main(String args[])
    {
    Scanner sr=new Scanner(System.in);
    int n=sr.nextInt();int i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++){
        if(i==0||i==(n-1)){
            System.out.print("* ");
        }
        else{
            if(j==0||j==(n-1)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        
        
    }System.out.println();
	}
    }}