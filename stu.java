import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javafx.scene.layout.Border;
public class stu extends JFrame implements ActionListener{
	JLabel jl;
	JButton jb;
	stu(){
		 setTitle("ɾ������");//����
	      setSize(300, 150);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(2, 1));
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jl = new JLabel("�Ѿ��ɹ�ɾ���ý�ʦ����Ϣ");
	      jp1.add(jl);
	      jp.add(jp1);

	      
	      JPanel jp2 = new JPanel();
	      jp2.setBackground(Color.CYAN);
	      jb = new JButton("ȷ��");
	      jb.setBackground(Color.white);
	      jb.addActionListener(this);
	      jp2.add(jb);
	      jp.add(jp2);
	     
	      
	      
	      add(jp);
	      
		 
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("ȷ��")) {
			 setVisible(false);// ����������,
             new Test11().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		}
		 
	 }
}
