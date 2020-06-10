package 策略模式.第一版;

public class CashReturn implements CashSuper
{
	private double	moneyCondition	= 0;
	private double	moneyReturn		= 0;

	public CashReturn(double moneyCondition, double moneyReturn)
	{
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	public double acceptCash(double money)
	{
		double result = money;
		if (money >= moneyCondition)
		{
			result = money - money / moneyCondition * moneyReturn;
		}
		return result;
	}
}