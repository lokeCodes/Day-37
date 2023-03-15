// https://www.codechef.com/START81D/problems/SUNNYDAY
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
		    int x = s.nextInt();
		    String res = x>24 ? "YES" : "NO";
		    System.out.println(res);
		}
	}
}
