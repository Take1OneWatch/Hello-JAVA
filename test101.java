import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class test101 extends JFrame implements ActionListener{
 String filename="e:\\ʵ��\\test101.txt";//����д��׼���õ��ı��ļ���ȫ·����
 JTextArea jta=new JTextArea(5,3);
 JScrollPane jsp=new JScrollPane(jta);
 JButton jb=new JButton("ȷ��");
 JPanel jp=new JPanel();
 test101(){
 setTitle("��ʦ��Ϣ");
 jb.addActionListener(this);
 jp.add(jb);
 add(jsp,BorderLayout.CENTER);
 add(jp,BorderLayout.SOUTH);
 setSize(300, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  readFile(filename);
  setVisible(true);
 }
 public static void main(String[] args) {
  new test101();
 }

 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==jb){
	   setVisible(false);// ����������,
       new Test1().setVisible(true);// �´�����ʾ
       dispose();//����������,�ͷ��ڴ���Դ
  }
 }
 public void readFile(String filename2){
  FileReader fr = null;
  BufferedReader br = null;
  try {
   fr= new FileReader(filename2);
   br=new BufferedReader(fr);
   String str;
   while((str=br.readLine())!=null){
     jta.append(str+"\n");
   }
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  } finally{
   try {
    br.close();
    fr.close();
   } catch (IOException e) {
    e.printStackTrace();
   }
  }
 }
}
