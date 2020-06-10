package 代理模式.第三版;

public class Proxy implements GiveGift
{
	Pursuit	gg;

	public Proxy(SchoolGirl mm)
	{
		gg = new Pursuit(mm);
	}

	public void giveDolls()
	{
		gg.giveDolls();
	}

	public void giveEat()
	{
		gg.giveEat();
	}

	public void giveBook()
	{
		gg.giveBook();
	}
	public void giveHat()
	{
		gg.giveHat();
	}
	public void giveMoney()
	{
		gg.giveMoney();
	}
}