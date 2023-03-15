// https://www.codechef.com/problems/ACS
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
		    int p = s.nextInt();
		    int res1,res2,res;
		    if(p>=100){
		        res1 = p/100;
		        res2 = p%100;
		        res = res1+res2;
		    }else{
		        res = p;
		    }
		    
		    int question = res<=10 ? res : -1;
		    System.out.println(question);
		}
	}
}
