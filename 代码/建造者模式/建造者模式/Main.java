package 建造者模式.建造者模式;

public class Main
{
	public static void main(String[] args)
	{
		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();

		Director director = new Director();
		director.construct(builder1);
		director.construct(builder2);

		Product product1 = builder1.getResult();
		Product product2 = builder2.getResult();

		product1.show();
		product2.show();
	}

	public void lauchFrame() {
	}
}
