package �۲���ģʽ.�ڶ���;

public class StockObserver extends Observer
{
	public StockObserver(String name, Secretary sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�رչ�Ʊ���飬����������");
	}
}