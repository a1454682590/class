package 建造者模式.第一版;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawPerson extends Frame
{
	public void paint(Graphics g)
	{
		Color c = g.getColor();
		g.setColor(Color.BLACK);

		g.fillOval(50, 50, 30, 30);
		g.fillRect(60, 80, 10, 50);
		g.drawLine(60, 80, 40, 130);
		g.drawLine(70, 80, 90, 130);
		g.drawLine(60, 130, 45, 180);
		g.drawLine(70, 130, 85, 180);

		g.setColor(c);
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
		DrawPerson person = new DrawPerson();
		person.lauchFrame();
	}
}
