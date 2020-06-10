package 装饰模式.第三版;

public class TShirts extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("T恤");
	}
}
class BigTrouser extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("短裤");
	}
}
class Sneakers extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("球鞋");
	}
}
 class Suit extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("西装");
	}
}
 class Tie extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("裙子");
	}
}
 class LeatherShoes extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("拖鞋");
	}
}