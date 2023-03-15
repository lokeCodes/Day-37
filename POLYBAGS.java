// https://www.codechef.com/problems/POLYBAGS
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int res = n%10==0 ? n/10 : (n/10)+1;
		    System.out.println(res);
		}
	}
}
