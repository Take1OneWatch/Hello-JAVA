import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Test4 extends JFrame implements ActionListener {
	JTextField write, write1;// �ı���
	JLabel jl1, jl2, jl3;
	JButton jb, jb1;
	private String firstLine;

	public Test4() {
		setTitle("��ѯ����");// ����
		setSize(300, 250);// ��С
		setLocationRelativeTo(null);// ����
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(new GridLayout(3, 1));

		
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.CYAN);
		jl2 = new JLabel("��������������Ҫ��ѯ�Ľ�ʦ������ !");
		jp1.add(jl2);
		jp.add(jp1);

		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.CYAN);
		jl1 = new JLabel("����:");
		write = new JTextField(12);
		jp2.add(jl1);
		jp2.add(write);
		jb = new JButton("��ѯ");
		jb.addActionListener(this);
		jb.setBackground(Color.white);
		jp2.add(jb);
		
		jp.add(jp2);
		
		
		
		
		
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.CYAN);
		jb1 = new JButton("����");
		jb1.setBackground(Color.white);
		jb1.addActionListener(this);// ��Ӷ�����Ӧ��
		jp3.add(jb1);
		jp.add(jp3);
		add(jp);
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("����")) {
			setVisible(false);// ����������,
			new Test2().setVisible(true);// �´�����ʾ
			dispose();// ����������,�ͷ��ڴ���Դ
		}
		if (cmd.equals("��ѯ")) {
			setVisible(false);// ����������,
			new TestAAAAA().setVisible(true);// �´�����ʾ
			dispose();// ����������,�ͷ��ڴ���Դ
				 
			 }
		}

	}
