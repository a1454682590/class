package 策略模式.第一版;
public class CashNormal implements CashSuper
{

	public double acceptCash(double money)
	{
		return money;
	}
}