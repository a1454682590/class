package 外观模式.外观模式;

public class Main
{
	public static void main(String[] args)
	{
		Facade facade = new Facade();
		
		facade.methodA();
		facade.methodB();
	}
}
