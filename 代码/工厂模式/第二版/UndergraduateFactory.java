package 工厂模式.第二版;

public class UndergraduateFactory implements IFactory
{
	public LeiFeng createLeiFeng()
	{
		return new Undergraduate();
	}
}