class Vetrimaaran
{
    void director()
    {
        System.out.println("won five National Film Awards");
    }
}
class polladhavan extends Vetrimaaran
{
    void dhanush()
    {
        System.out.println("Action thriller film");
    }
}
class Visaranai extends Vetrimaaran
{
    void dinesh()
    {
        System.out.println("crime drama film");
    }
}
class Viduthalai extends Vetrimaaran
{
    void soori()
    {
        System.out.println("period crime thriller film");
    }
}
public class Main
{
	public static void main(String[] args) {
	    polladhavan balajii=new polladhavan();
	    Visaranai samuthirakani=new Visaranai();
	     Viduthalai vjs=new  Viduthalai();
	     balajii.dhanush();
	     samuthirakani.dinesh();
	     vjs.soori();
	     vjs.director();
	}
}
