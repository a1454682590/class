package ����ģʽ.������;

public class Pursuit implements GiveGift
{
	SchoolGirl	mm;

	public Pursuit(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " ����ë������");
	}

	public void giveEat()
	{
		System.out.println(mm.name + " ����Ե�");
	}

	public void giveBook()
	{
		System.out.println(mm.name + " ������");
	}
	public void giveHat()
	{
		System.out.println(mm.name + " ����ñ��");
	}
	public void giveMoney()
	{
		System.out.println(mm.name + " ����Ǯ");
	}
}