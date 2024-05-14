import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[n+m];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=s.nextInt();
        }
        for(int i=0;i<n+m;i++){
            if(i<n){
                c[i]=a[i];
            }
            else{
                c[i]=b[i-n];
            }
        }
        Arrays.sort(c);
        for(int i=0;i<n+m;i++){
            count=0;
            for(int j=i+1;j<n+m;j++){
                if(c[i]==c[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.print(c[i]+" ");
            }
        }
    }
}
