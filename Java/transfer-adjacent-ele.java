import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();
		}
		if(n%2!=0){
		for(int i=0;i<n;i++){
		    if(i%2==0 && i!=n-1)
		    System.out.print(a[i+1]+" ");
		    else if(i%2!=0 && i!=n-1)
		    System.out.print(a[i-1]+" ");
		    else
		    System.out.print(a[i]);
		}
		}
		if(n%2==0){
		for(int i=0;i<n;i++){
		    if(i%2==0)
		    System.out.print(a[i+1]+" ");
		    else
		    System.out.print(a[i-1]+" ");
		}
		}
	}
}
