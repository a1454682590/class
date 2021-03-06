package 外观模式.第二版;

import 外观模式.第一版.NationalDebt1;
import 外观模式.第一版.Realty1;
import 外观模式.第一版.Stock1;
import 外观模式.第一版.Stock2;
import 外观模式.第一版.Stock3;

public class Fund
{
	Stock1			gu1;
	Stock2			gu2;
	Stock3			gu3;
	NationalDebt1	nd1;
	Realty1			rt1;

	public Fund()
	{
		gu1 = new Stock1();
		gu2 = new Stock2();
		gu3 = new Stock3();
		nd1 = new NationalDebt1();
		rt1 = new Realty1();
	}

	public void buyFund()
	{
		gu1.buy();
		gu2.buy();
		gu3.buy();
		nd1.buy();
		rt1.buy();
	}

	public void sellFund()
	{
		gu1.sell();
		gu2.sell();
		gu3.sell();
		nd1.sell();
		rt1.sell();
	}
}
