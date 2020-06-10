package ������ģʽ.�ڶ���;

import java.awt.*;

public class PersonFatBuilder
{
	private Graphics	g;

	public PersonFatBuilder(Graphics g)
	{
		this.g = g;
	}

	public void build()
	{
		Color c = g.getColor();
		g.setColor(Color.BLACK);
		
		g.fillOval(50, 50, 30, 30);// ͷ
		g.fillRect(60, 80, 10, 50);// ����
		g.drawLine(60, 80, 40, 130);// ����
		g.drawLine(70, 80, 90, 130);// ����
		g.drawLine(60, 130, 45, 180);// ����
		g.drawLine(70, 130, 85, 180);// ����
		
		g.setColor(c);
	}
}