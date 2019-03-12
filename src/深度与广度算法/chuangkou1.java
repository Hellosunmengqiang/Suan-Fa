package 深度与广度算法;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class chuangkou1 {
	public static void main(String[] args) {
		JFrame jfs=new JFrame("菜单");
		JLabel jl=new JLabel("文本");
		JButton jb=new JButton("确定");
		jfs.add(jl);
		jfs.add(jb);
		jfs.setLayout(new FlowLayout());
		jfs.setBounds(60,150,200,180);
		jfs.setVisible(true);
		jfs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
