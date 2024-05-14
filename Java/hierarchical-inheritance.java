
class Main extends Floor
{
    void bl()
	
	{
	    
		Main m=new Main();
		m.bl2();
		System.out.println("One");
	}
}
public class Blk extends Floor
{
    public static void main(String[] args)
    
    {
    Blk b=new Blk();
    b.fl();
    System.out.println("Two");
    }
}
class Floor
{
    void fl(){
        System.out.println("2");
    }
    void bl2()
    {
        System.out.println("1");
    }
}
/*
The Main (The class that is as same as the file name) only executes...
If needed chage the name of the  file to the class taht is needed to be executed.
and change the public staticvoid Main
*/
