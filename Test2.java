import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame implements ActionListener{
	JButton jb,jb1,jb2;
	JTextField write,write1;//�ı���
	public Test2(){
		  setTitle("��ѯ����");//����
	      setSize(300, 250);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(2,1));
	   
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jb=new JButton("�����Ų�ѯ");
	      jb.setBackground(Color.GREEN);
	      jb.addActionListener(this);
	      jp1.add(jb);
	      jp.add(jp1);   
          jb1=new JButton("��������ѯ");
          jb1.setBackground(Color.GREEN);
          jb1.addActionListener(this);
	      jp1.add(jb1);
		  jp.add(jp1);
		  
		  
		  JPanel jp2 = new JPanel();
		  jp2.setBackground(Color.CYAN);
		  jb2=new JButton(" �������˵�");
		  jb2.setBackground(Color.white);
	      jb2.addActionListener(this);// ��Ӷ�����Ӧ��
	      jp2.add(jb2);
	      
	      jp.add(jp2);
	      add(jp);
	      
	      
	      
	      

	}
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("�����Ų�ѯ")) {
			 setVisible(false);// ����������,
             new Test3().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
		 if (cmd.equals("��������ѯ")) {
			 setVisible(false);// ����������,
             new Test4().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
		 if (cmd.equals(" �������˵�")) {
			 setVisible(false);// ����������,
             new Test1().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
		
	 }
	 public static void main(String[] args) {
	        new Test1().setVisible(true);//������¼����,���ɼ�
	    }
	 
}