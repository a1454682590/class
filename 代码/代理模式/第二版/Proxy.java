package ����ģʽ.�ڶ���;
public class Proxy
{
	SchoolGirl	mm;

	public Proxy(SchoolGirl mm)
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