package װ��ģʽ.�ڶ���;
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("��˧");

		System.out.println("��һ��װ��:");
		Finery dtx = new TShirts();
		Finery kk = new Shorts();
		Finery pqx = new Shoes();

		dtx.show();
		kk.show();
		pqx.show();
		person.show();

		System.out.println("�ڶ���װ��:");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();

		xz.show();
		ld.show();
		px.show();
		person.show();
	}
}
