package 建造者模式.第二版;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame
{
	public void paint(Graphics g)
	{
		PersonThinBuilder p = new PersonThinBuilder(g);
		p.build();
	}

	public void lauchFrame()
	{
		this.setLocation(400, 300);
		this.setSize(800, 600);

		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		this.setBackground(Color.WHITE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Main drawPerson = new Main();
		drawPerson.lauchFrame();
	}
}
