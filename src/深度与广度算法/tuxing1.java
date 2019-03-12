package 深度与广度算法;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
class M extends JPanel{
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g)
	{
		Graphics2D g_2d=(Graphics2D)g;
		String s="Hello";
		
		Ellipse2D ellispse=new Ellipse2D.Double(30,30,80,30);
		AffineTransform trans=new AffineTransform();
		for(int i=0;i<=24;i++)
		{
			trans.rotate(15.0*Math.PI/180,70,45);
			g_2d.setTransform(trans);
			g_2d.draw(ellispse);
		}
		for(int i=1;i<=12;i++)
		{
			trans.rotate(30.0*Math.PI/180,60,160);
			g_2d.setTransform(trans);
			g_2d.drawString(s, 60, 160);
		}
		
	}
}
public class tuxing1 {
	public static void main(String[] args) {
		JFrame win=new JFrame();
		win.setSize(600,800);
		win.add(new M());
		win.setVisible(true);
	}

}













