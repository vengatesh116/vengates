import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
		char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z' };
		int[] flag = new int[26];
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] ch = str.toCharArray();
		int len = ch.length;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < len; j++) {
				if (Character.toLowerCase(alpha[i]) == ch[j]) {
					flag[i]=1;
				}
			}
		}
		int c=0;
		for(int i=0;i<26;i++) {
			if(flag[i]!=1) {
				c=1;
			}
		}
		if(c==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		s.close();
	}
}