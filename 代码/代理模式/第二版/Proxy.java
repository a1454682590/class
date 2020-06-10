package 代理模式.第二版;
public class Proxy
{
	SchoolGirl	mm;

	public Proxy(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " 送你毛绒娃娃");
	}

	public void giveEat()
	{
		System.out.println(mm.name + " 送你吃的");
	}

	public void giveBook()
	{
		System.out.println(mm.name + " 送你书");
	}
	public void giveHat()
	{
		System.out.println(mm.name + " 送你帽子");
	}
	public void giveMoney()
	{
		System.out.println(mm.name + " 送你钱");
	}
}