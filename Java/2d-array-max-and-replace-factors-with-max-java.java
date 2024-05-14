import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int max=0;
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
		    for(int j=0;j<m;j++){
		        if(a[i][j]>max){
		            max=a[i][j];
		        }
		    }
		}
		System.out.println(max);
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(max%a[i][j]==0){
		            a[i][j]=max;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		       System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
