package 代理模式.第三版;

public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl xiaoming = new SchoolGirl();
		xiaoming.setName("小铭");

		Proxy wangshuai = new Proxy(xiaoming);
		wangshuai.giveDolls();
		wangshuai.giveEat();
		wangshuai.giveBook();
		wangshuai.giveHat();
		wangshuai.giveMoney();
	}
}
