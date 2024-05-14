import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m=0;
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		    if(a[i]==0){
		        m=a[i];
		        a[i]=a[j];
		        a[j]=m;}}}
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
	}

}
}
