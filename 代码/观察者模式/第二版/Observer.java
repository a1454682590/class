package 观察者模式.第二版;

//抽象的观察者
public abstract class Observer
{
	protected String	name;
	protected Secretary	sub;

	public Observer(String name, Secretary sub)
	{
		this.name = name;
		this.sub = sub;
	}

	public abstract void update();
}



