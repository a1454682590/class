package �۲���ģʽ.��һ��;

public class Main
{
	public static void main(String[] args)
	{
		Secretary tongzizhe = new Secretary();
		
		StockObserver tongshi1 = new StockObserver("С��", tongzizhe);
		StockObserver tongshi2 = new StockObserver("С��", tongzizhe);
		
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.setAction("�ϰ������!");
		
		tongzizhe.announce();
	}
}