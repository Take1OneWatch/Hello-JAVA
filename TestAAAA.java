import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestAAAA extends JFrame implements ActionListener{
	JLabel jl,jl1;
	JButton jb;
	TestAAAA(){
		 setTitle("");//����
	     setSize(300, 200);//��С
	     setLocationRelativeTo(null);//����
	     JPanel jp = new JPanel();
	     jp.setLayout(new GridLayout(3,1));
	     
	     
	     JPanel jp1 = new JPanel();
	     jp1.setBackground(Color.CYAN);
	     jl= new JLabel("����:");
	     jp1.add(jl);
	     jp.add(jp1);
	     
	     
	     
	     JPanel jp2 = new JPanel();
	     jp2.setBackground(Color.CYAN);
	     jl1 = new JLabel("������Ч���ù��ŵĽ�ʦ��ϢΪ��");
	     jp2.add(jl1);
	     jp.add(jp2);
	     
	     
	     
	     JPanel jp3 = new JPanel();
	     jp3.setBackground(Color.CYAN);
	     jb = new JButton("ȷ��");
	     jb.setBackground(Color.white);
	     jb.addActionListener(this);
	     jp3.add(jb);
	     jp.add(jp3);
	     
	     
	     
	     add(jp);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("ȷ��")) {
			 setVisible(false);// ����������,
             new Test1().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
	 }
}