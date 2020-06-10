package 策略模式.工厂与策略模式结合;

public class CashRebate implements CashSuper
{
	private double	moneyRebate	= 1;

	public CashRebate(double moneyRebate)
	{
		this.moneyRebate = moneyRebate;
	}

	public double acceptCash(double money)
	{
		return money * moneyRebate;
	}
}
