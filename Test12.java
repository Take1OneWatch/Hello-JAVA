import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Test12 extends JFrame implements ActionListener{
	JTextField write,write1;//�ı���
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	public Test12(){
		  setTitle("ɾ������");//����
	      setSize(300, 150);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setBackground(Color.CYAN);
	      jp.setLayout(new FlowLayout());
	      
	      jl2 = new JLabel("   ��������������Ҫɾ���Ľ�ʦ������ ��         ");
	      jp.add(jl2);
	      jl1= new JLabel("����:");
	      write = new JTextField(12);
	      jp.add(jl1);
	      jp.add(write);
	   
	      jb=new JButton("ɾ��");
	      jb.addActionListener(this);
	      jb.setBackground(Color.WHITE);
	      jp.add(jb);
	      jb1=new JButton("����");
	      jb1.setBackground(Color.WHITE);
	      jb1.addActionListener(this);// ��Ӷ�����Ӧ��
	      jp.add(jb1);
	      add(jp);
	    //  add(jp1);
	      
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("����")) {
			 setVisible(false);// ����������,
             new Test6(cmd).setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		}
		if (cmd.equals("ɾ��")) {
			 setVisible(false);// ����������,
             new TestAAAAA().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		}
	}
}
