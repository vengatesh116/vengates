import java.util.*;
class pro49
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int upper=x.nextInt();
        int lower=x.nextInt();
        int s=0,s1=0;
        for(int  i=1;i<upper;i++)
        {
            s+=i;
        }
        for(int j=0;j<lower;j++)
        {
            s1+=j*s;
        }
        System.out.print(s1);
    }
}