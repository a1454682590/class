package ����ģʽ.������;

public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl xiaoming = new SchoolGirl();
		xiaoming.setName("С��");

		Proxy wangshuai = new Proxy(xiaoming);
		wangshuai.giveDolls();
		wangshuai.giveEat();
		wangshuai.giveBook();
		wangshuai.giveHat();
		wangshuai.giveMoney();
	}
}
