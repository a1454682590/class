package װ��ģʽ.��һ��;
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("��˧");

		System.out.println("��һ��װ��:");

		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();

		System.out.println("�ڶ���װ��:");

		person.wearSuit();
		person.wearTie();
		person.wearLeatherShoes();
		person.show();
	}
}
