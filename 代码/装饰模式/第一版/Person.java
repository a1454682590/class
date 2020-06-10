package 装饰模式.第一版;
public class Person
{
	private String	name;

	public Person(String name)
	{
		this.name = name;
	}

	public void wearTShirts()
	{
		System.out.println("T恤");
	}

	public void wearBigTrouser()
	{
		System.out.println("短裤");
	}

	public void wearSneakers()
	{
		System.out.println("名牌球鞋");
	}

	public void wearSuit()
	{
		System.out.println("泳衣");
	}

	public void wearTie()
	{
		System.out.println("泳裤");
	}

	public void wearLeatherShoes()
	{
		System.out.println("拖鞋");
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}