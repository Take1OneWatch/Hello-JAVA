import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestAAAA extends JFrame implements ActionListener{
	JLabel jl,jl1;
	JButton jb;
	TestAAAA(){
		 setTitle("");//标题
	     setSize(300, 200);//大小
	     setLocationRelativeTo(null);//居中
	     JPanel jp = new JPanel();
	     jp.setLayout(new GridLayout(3,1));
	     
	     
	     JPanel jp1 = new JPanel();
	     jp1.setBackground(Color.CYAN);
	     jl= new JLabel("错误:");
	     jp1.add(jl);
	     jp.add(jp1);
	     
	     
	     
	     JPanel jp2 = new JPanel();
	     jp2.setBackground(Color.CYAN);
	     jl1 = new JLabel("操作无效，该工号的教师信息为空");
	     jp2.add(jl1);
	     jp.add(jp2);
	     
	     
	     
	     JPanel jp3 = new JPanel();
	     jp3.setBackground(Color.CYAN);
	     jb = new JButton("确定");
	     jb.setBackground(Color.white);
	     jb.addActionListener(this);
	     jp3.add(jb);
	     jp.add(jp3);
	     
	     
	     
	     add(jp);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("确定")) {
			 setVisible(false);// 本窗口隐藏,
             new Test1().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
	 }
}