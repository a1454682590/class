package 装饰模式.第一版;
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("王帅");

		System.out.println("第一种装扮:");

		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();

		System.out.println("第二种装扮:");

		person.wearSuit();
		person.wearTie();
		person.wearLeatherShoes();
		person.show();
	}
}
