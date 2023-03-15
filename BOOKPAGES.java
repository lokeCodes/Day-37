// https://www.codechef.com/START81D/problems/BOOKPAGES
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
			int res1=0;
			int res2=0;
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			
			for(int i=0;i<n;i+=2){
				res1 = res1+arr[i];
			}
			for(int i=1;i<n;i+=2){
				res2 = res2+arr[i];
			}

//			System.out.println(res1+" "+res2);
			
			if(res1%2!=0 && res2%2!=0){
				System.out.println("YES");
			}else if(res1%2==0 && res2%2==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
