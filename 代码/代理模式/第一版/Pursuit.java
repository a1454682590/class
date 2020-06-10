package 代理模式.第一版;
public class Pursuit
{
	SchoolGirl	mm;

	public Pursuit(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " 我想看");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " 爱奇艺");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " 你有嘛");
	}
}