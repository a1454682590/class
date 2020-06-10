package 简单工厂模式.第三版;

public class class003
{
	public static double getResult(double numberA, double numberB,
			String operator)
	{
		double result = 0;
		
		if ("+".equals(operator))
			result = numberA + numberB;
		else if ("-".equals(operator))
			result = numberA - numberB;
		else if ("*".equals(operator))
			result = numberA * numberB;
		else if ("/".equals(operator))
			result = numberA / numberB;

		return result;
	}
}
