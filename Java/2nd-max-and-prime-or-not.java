import java.util.*;
public class Main
{
    static int i=0;
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();//array size
	    int a[]=new int[n];//array declaration
	    for(i=0;i<n;i++)
	    a[i]=s.nextInt();// get array elements
	    int b=0;
	   Arrays.sort(a);
	   if(a[i-1]!=a[i-2])
	   b=a[i-2];
	   else
	   {
	    while(a[i-1]==a[i-2] && i>=0)
	    {
	    i--;
	    }
	   b=a[i-2];
	   }
	   int c=0;
	   for(int j=2;j<b;j++)
	   {
	       if(b%j==0)
	       c++;
	   }
	   System.out.println(c==0?b+"yes":b+"no");
	}
}
