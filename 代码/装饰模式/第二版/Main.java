package 装饰模式.第二版;
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("王帅");

		System.out.println("第一种装扮:");
		Finery dtx = new TShirts();
		Finery kk = new Shorts();
		Finery pqx = new Shoes();

		dtx.show();
		kk.show();
		pqx.show();
		person.show();

		System.out.println("第二种装扮:");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();

		xz.show();
		ld.show();
		px.show();
		person.show();
	}
}
