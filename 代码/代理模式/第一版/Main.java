package 代理模式.第一版;
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl xiaoming = new SchoolGirl();
		xiaoming.setName("小明");

		Pursuit wangshuai = new Pursuit(xiaoming);

		wangshuai.giveDolls();
		wangshuai.giveFlowers();
		wangshuai.giveChocolate();
	}
}
