import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int[n][];
		for(int i=0;i<n;i++){
		    int b=s.nextInt();
		    a[i]=new int[b];
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<a[i].length;j++){
		        a[i][j]=s.nextInt();
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<a[i].length;j  ++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
