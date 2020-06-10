package 策略模式.工厂与策略模式结合;

public class CashNormal implements CashSuper
{

	public double acceptCash(double money)
	{
		return money;
	}
}