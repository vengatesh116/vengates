package Guvi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Country {
	public static void main(String[] args) throws IOException {
	int i,count,m,n,z=0,s=0,x=0;
	String ss=null;
	BufferedReader be=new BufferedReader(new InputStreamReader(System.in));
	ss=be.readLine();
	int num=Integer.parseInt(ss);
	int[] ar=new int[num+1];
	for(n=1,m=0;n<=num;n++,m++){
	count=0;
	for(i=2;i<=n/2;i++)
	{if(n%i==0){
	count++;
	break;
	}}
	if(count==0&&n!=1)
	{ar[m]=n;}}
	for(int j=0;j<num;j++)
	{if(ar[j]!=0){
	 z=z+ar[j];      
	 for(int f=1;f<num;f++)
	 {
	 if(z==ar[f+1])
	 {x++;}}}}
	System.out.println(x);
	}
	}
