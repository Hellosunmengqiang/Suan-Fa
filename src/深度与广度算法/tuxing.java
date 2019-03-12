package 深度与广度算法;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Mycanvas extends JPanel{
	public void paint(Graphics g)
	{
		Graphics2D g_2d=(Graphics2D)g;
		Arc2D arc=new Arc2D.Double(0,0,100,100,-90,-180,Arc2D.PIE);
		g_2d.setColor(Color.black);
		g_2d.fill(arc);
		g_2d.setColor(Color.white);
		arc.setArc(25,0,50,50,-90,-180,Arc2D.PIE);
		g_2d.fill(arc);
		g_2d.setColor(Color.black);
		Ellipse2D ellispse=new Ellipse2D.Double(40,15,20,20);
		g_2d.fill(ellispse);
		arc.setArc(25, 50, 50, 50, 90, -180, Arc2D.PIE);
		g_2d.fill(arc);
		g_2d.setColor(Color.white);
		ellispse.setFrame(40, 65, 20, 20);
		g_2d.fill(ellispse);
		g.setColor(Color.blue);
		Polygon po=new Polygon();
		po.addPoint(150, 10);
		po.addPoint(100, 90);
		po.addPoint(210, 90);
		po.addPoint(260, 10);
		g_2d.draw(po);
		
	}
}
public class tuxing {
	public static void main(String[] args) {
		JFrame win=new JFrame();
		win.setSize(400,400);
		win.add(new Mycanvas());
		win.setVisible(true);
	}

}













