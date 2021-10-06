import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adsec extends JFrame implements ActionListener 
{
	JButton Enter,Creatb,backBtn;
    JLabel backgroundImg;
    JTextField un,pw;
public adsec()
{
        Jframe Admin = new Jframe();

        Admin.setSize(816,615);
        Admin.setLayout(null);
        Admin.setLocationRelativeTo(null);
        Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adding Image Background
        ImageIcon img = new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\backg\\004.png");
        backgroundImg = new JLabel("", img,JLabel.CENTER);
        backgroundImg.setBounds(0,0,800,576);
        Admin.add(backgroundImg);
		Admin.setVisible(true);
}
}