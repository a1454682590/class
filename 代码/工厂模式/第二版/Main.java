package 工厂模式.第二版;

public class Main
{
	public static void main(String[] args)
	{
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();

		student.Cook();
		student.sweep();
		student.wash();
		student.buyVegetables();
	}
}
