import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class test101 extends JFrame implements ActionListener{
 String filename="e:\\实验\\test101.txt";//这里写你准备好的文本文件的全路径名
 JTextArea jta=new JTextArea(5,3);
 JScrollPane jsp=new JScrollPane(jta);
 JButton jb=new JButton("确定");
 JPanel jp=new JPanel();
 test101(){
 setTitle("教师信息");
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
	   setVisible(false);// 本窗口隐藏,
       new Test1().setVisible(true);// 新窗口显示
       dispose();//本窗口销毁,释放内存资源
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
