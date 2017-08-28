import java.util.*;

class google
{
public static void main(String[] args) 
{
	int count=0,add=0;
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> bl=new ArrayList<Integer>();
	Scanner in=new Scanner(System.in);
	String a=in.nextLine();
	char[] ab=a.toCharArray();
	int len=a.length();
		for(int i=0;i<len;i++)
		{
			int temp=Character.getNumericValue(ab[i]);
			
			if(temp>=0&&temp<=9)
			{
			al.add(temp);
			count++;
			}
			else
			{
			
				if(count>0)
				{
				Collections.sort(al);
				Collections.reverse(al);
				bl.add(al.get(0));
				al.clear();
				count=0;
				}
				continue;
			
			}
			
		}
			if(count>0)
				{
				Collections.sort(al);
				Collections.reverse(al);
				bl.add(al.get(0));
				al.clear();
				count=0;
				}
for(int z=0;z<bl.size();z++)
{
add=add+bl.get(z);
}
System.out.println(add);	
    
}