import java.util.Scanner;


public class Pro51 {
	public static void main(String[] args)
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m & n");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m<=0||n<=0)
        {
        	System.out.println(m);
        }
        else
        {
        	int w=n*m;
        	System.out.println(w-1);
        }
        
	}

}