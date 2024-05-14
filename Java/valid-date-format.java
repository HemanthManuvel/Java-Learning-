import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String a=s.next();
	    String b[]=a.split("/");
	    int d=Integer.parseInt(b[0]);
	    int m=Integer.parseInt(b[1]);
	    int y=Integer.parseInt(b[2]);
	    if(y>=1900 && y<=9999)
	    {
	        if((d>=1 && d<=31)&&(m==1||m==3||m==5||m==7||m==8||m==10||m==12))
	        System.out.print("valid");
	        else if((d>=1&&d<=30)&&(m==4||m==6||m==9||m==11))
	        System.out.print("valid");
	        else if((d>=1&&d<=28)&&(m==2))
	        System.out.print("valid");
	        else if((d==29)&&(m==2)&&((y%4==0&&y%100!=0)||(y%400==0)))
	        System.out.print("valid");
	        else
	        System.out.print("Invalid");
	    }
	    else
		System.out.println("Invalid");
	}

