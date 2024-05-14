import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        a[i][j]=s.nextInt();
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
			for(int i=0;i<n;i++){
			    int b1=0;
		    for(int j=0;j<m;j++){
		        b1=b1+a[i][j];
		    }
		    b[i]=b1;
		}
		for(int i=0;i<n;i++)
		System.out.print(b[i]+" ");
	}
}
