package 工厂模式.第二版;

public class VolunteerFactory implements IFactory
{
	public LeiFeng createLeiFeng()
	{
		return new Volunteer();
	}
}