import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int st=sc.nextInt();
		int en=sc.nextInt();
		StringBuffer s=new StringBuffer("TEAM");
		s.append("TERV");
		System.out.println(s);
		StringBuffer s3=new StringBuffer(s1);
		StringBuffer s2=new StringBuffer(s1);
		StringBuffer s4=new StringBuffer(s1);
		s2.insert(2,"terv");
		System.out.println(s2);
		s3.delete(st,en);
		System.out.println(s3);
		s4.replace(st,en,"terv");
		System.out.println(s4);
		StringBuffer s5=new StringBuffer(s1);
		s5.reverse();
		System.out.println(s5);
	}
}
