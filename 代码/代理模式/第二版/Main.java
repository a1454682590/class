package 代理模式.第二版;
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl xiaoming = new SchoolGirl();
		xiaoming.setName("小明");

		Proxy wangshuai = new Proxy(xiaoming);

		wangshuai.giveDolls();
		wangshuai.giveEat();
		wangshuai.giveBook();
		wangshuai.giveHat();
		wangshuai.giveMoney();
	}
}