import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m=0;
		int b[] = new int[n];
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(a[i]!=0){
		    b[m]=a[i];
		    m++;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(b[i]+" ");
		}
	}
}
