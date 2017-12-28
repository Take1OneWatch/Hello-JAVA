import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Test4 extends JFrame implements ActionListener {
	JTextField write, write1;// 文本框
	JLabel jl1, jl2, jl3;
	JButton jb, jb1;
	private String firstLine;

	public Test4() {
		setTitle("查询窗口");// 标题
		setSize(300, 250);// 大小
		setLocationRelativeTo(null);// 居中
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(new GridLayout(3, 1));

		
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.CYAN);
		jl2 = new JLabel("请在下面输入想要查询的教师的姓名 !");
		jp1.add(jl2);
		jp.add(jp1);

		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.CYAN);
		jl1 = new JLabel("姓名:");
		write = new JTextField(12);
		jp2.add(jl1);
		jp2.add(write);
		jb = new JButton("查询");
		jb.addActionListener(this);
		jb.setBackground(Color.white);
		jp2.add(jb);
		
		jp.add(jp2);
		
		
		
		
		
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.CYAN);
		jb1 = new JButton("返回");
		jb1.setBackground(Color.white);
		jb1.addActionListener(this);// 添加动作响应器
		jp3.add(jb1);
		jp.add(jp3);
		add(jp);
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("返回")) {
			setVisible(false);// 本窗口隐藏,
			new Test2().setVisible(true);// 新窗口显示
			dispose();// 本窗口销毁,释放内存资源
		}
		if (cmd.equals("查询")) {
			setVisible(false);// 本窗口隐藏,
			new TestAAAAA().setVisible(true);// 新窗口显示
			dispose();// 本窗口销毁,释放内存资源
				 
			 }
		}

	}
