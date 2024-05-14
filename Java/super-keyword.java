class pradeep
{
    void nikithaa()
    {
        System.out.println("lovers");
    }
}
class mamakuttyy extends pradeep
{
    void nikithaa()
    {
        System.out.println("Ex lover");
        super.nikithaa();
    }
}
class Revii extends mamakuttyy
{
    void nikithaa()
    {
        System.out.println("Besti");
        super.nikithaa();
    }
}
public class Main
{
	public static void main(String[] args) {
	    System.out.println("love today");
	    Revii c=new Revii();
	    c.nikithaa();
	}
}
