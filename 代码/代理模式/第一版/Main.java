package ����ģʽ.��һ��;
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl xiaoming = new SchoolGirl();
		xiaoming.setName("С��");

		Pursuit wangshuai = new Pursuit(xiaoming);

		wangshuai.giveDolls();
		wangshuai.giveFlowers();
		wangshuai.giveChocolate();
	}
}
