import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame implements ActionListener {
	 JButton jb1,jb2,jb3,jb4,jb5;//��ť
	 JLabel jl;
	 public Test1() {
		 setTitle("��ʦ��Ϣ����");
		 setSize(300, 250);
		 setLocationRelativeTo(null);//���ô��ھ���
		 setLayout(new BorderLayout());
		 JPanel jp = new JPanel();
		 jp.setLayout(new GridLayout(4, 1));
		 jp.setBackground(Color.BLUE);
		 
		 
		 JPanel jp1 = new JPanel();
		 jp1.setBackground(Color.CYAN);
		 jl=new JLabel("    ��ӭ������ʦ��Ϣ����ϵͳ");
		 jp1.add(jl);
		 jp.add(jp1);
		 
		 
		 
		 JPanel jp2 = new JPanel();
		 jp2.setBackground(Color.CYAN);
		 jb1 = new JButton("��ѯ��ʦ��Ϣ");
		 jb1.setBackground(Color.WHITE);
		 jb1.addActionListener(this);// ��Ӷ�����Ӧ��
		 jp2.add(jb1);
		

		 jb2 = new JButton("���ӽ�ʦ��Ϣ");
		 jb2.setBackground(Color.GREEN);
		 jb2.addActionListener(this);// ��Ӷ�����Ӧ��
		 jp2.add(jb2);
		 jp.add(jp2);
		 
		 
		 JPanel jp3 = new JPanel();
		 jp3.setBackground(Color.CYAN);
		 jb3 = new JButton("ɾ����ʦ��Ϣ");
		 jb3.setBackground(Color.red);
		 jb3.addActionListener(this);// ��Ӷ�����Ӧ��
		 jp3.add(jb3);
		 
	
		 jb4 = new JButton("�޸Ľ�ʦ��Ϣ");
		 jb4.setBackground(Color.YELLOW);
		 jb4.addActionListener(this);// ��Ӷ�����Ӧ��
		 jp3.add(jb4);
		 jp.add(jp3);
		 
		 
		 JPanel jp4 = new JPanel();
		 jp4.setBackground(Color.CYAN);
		 jb5=new JButton("�˳�");
		 jb5.setBackground(Color.WHITE);
		 jb5.addActionListener(this);
		 jp4.add(jb5);
		 jp.add(jp4);
		 add(jp);

	 }
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("��ѯ��ʦ��Ϣ")) {
			   setVisible(false);// ����������,
               new Test2().setVisible(true);// �´�����ʾ
               dispose();//����������,�ͷ��ڴ���Դ
		 }
		 if (cmd.equals("���ӽ�ʦ��Ϣ")) {
			 setVisible(false);// ����������,
             new TestA().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
    		 if (cmd.equals("ɾ����ʦ��Ϣ")) {
    			 setVisible(false);// ����������,
                 new Test5().setVisible(true);// �´�����ʾ
                 dispose();//����������,�ͷ��ڴ���Դ
    		 }
         if (cmd.equals("�޸Ľ�ʦ��Ϣ")) {
        	 setVisible(false);// ����������,
             new Test8().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
         
		 if (cmd.equals("�˳�")) {
			 setVisible(false);// ����������
			 dispose();//����������,�ͷ��ڴ���Դ
		 }
		 
	 }
	 public static void main(String[] args) {
	        new Test1().setVisible(true);//������¼����,���ɼ�
	    }
}