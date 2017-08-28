
public class prgm32inpro {
    public static void main(String[] args) {
     int m,n,i,j,temp,p = 0;
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
     int[] ar=new int[m*n];
     int[][] a=new int[10][10];
     for(i=0;i<m*n;i++)
     {ar[i]=sc.nextInt();
    }
     for(i=0;i<m;i++)
     {for(j=i+1;j<n;j++)
     {
         if(ar[i]>ar[j])
         {
             temp=ar[i];
             ar[i]=ar[j];
             ar[j]=temp;
         }
     }
     }for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
         {
             a[i][j]=ar[p];
             p++;
         }
     }for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
         {
             System.out.print(""+a[i][j]);
         }
         System.out.print("");
     }
    }
 
}