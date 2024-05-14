import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int a=s1.length();
		char b[]=s1.toCharArray();
		for(int i=0;i<a;i+=2){
		    int k=b[i+1]-'0';
		    while(k--!=0){
		        System.out.print(b[i]);
		    }
		}
	}
}



import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String w=s.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
            if(Character.isDigit(c)){
                int count=c-'1';
                for(int j=0;j<count;j++){
                    sb.append(w.charAt(i-1));
                }
            }
            else{
                sb.append(c);
            }
        }
        String r=sb.toString();
        System.out.print(r);
    }
}
