package 建造者模式.建造者模式;

public class ConcreteBuilder1 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("部件A");
	}

	public void buildPartB()
	{
		product.add("部件B");
	}

	public Product getResult()
	{
		return product;
	}

}