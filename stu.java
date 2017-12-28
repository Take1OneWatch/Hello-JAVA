import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javafx.scene.layout.Border;
public class stu extends JFrame implements ActionListener{
	JLabel jl;
	JButton jb;
	stu(){
		 setTitle("删除窗口");//标题
	      setSize(300, 150);//大小
	      setLocationRelativeTo(null);//居中
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(2, 1));
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jl = new JLabel("已经成功删除该教师的信息");
	      jp1.add(jl);
	      jp.add(jp1);

	      
	      JPanel jp2 = new JPanel();
	      jp2.setBackground(Color.CYAN);
	      jb = new JButton("确定");
	      jb.setBackground(Color.white);
	      jb.addActionListener(this);
	      jp2.add(jb);
	      jp.add(jp2);
	     
	      
	      
	      add(jp);
	      
		 
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("确定")) {
			 setVisible(false);// 本窗口隐藏,
             new Test11().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		}
		 
	 }
}
