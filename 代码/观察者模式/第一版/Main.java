package 观察者模式.第一版;

public class Main
{
	public static void main(String[] args)
	{
		Secretary tongzizhe = new Secretary();
		
		StockObserver tongshi1 = new StockObserver("小王", tongzizhe);
		StockObserver tongshi2 = new StockObserver("小李", tongzizhe);
		
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		tongzizhe.setAction("老板回来了!");
		
		tongzizhe.announce();
	}
}