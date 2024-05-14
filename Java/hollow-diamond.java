import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=i;j<n;j++)
	              {System.out.print(" ");}
	            for(int k=1;k<=2*i-1;k++)
	             {
	                 System.out.print((k==1||k==2*i-1)?"*":" "); }
	              System.out.println();
	        }
	        for(int i=n-1;i>=1;i--)
	        {
	            for(int j=i;j<n;j++)
	              {System.out.print(" ");}
	            for(int k=1;k<=2*i-1;k++)
	             {System.out.print((k==1||k==2*i-1)?"*":" "); }
	              System.out.println();
	        }
	}
}
