import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminLoginPage extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton Enter,Creatb,backBtn;
    JLabel backgroundImg;
    JTextField un,pw;

    public AdminLoginPage()
	{
        //Setting Up Main Interface
        super("Login");
        this.setSize(816,615);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adding Image Background
        ImageIcon img = new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\backg\\002.png");
        backgroundImg = new JLabel("", img,JLabel.CENTER);
        backgroundImg.setBounds(0,0,800,576);
        this.add(backgroundImg);

        //adding button
        ImageIcon EnterButtonImg = new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\butt\\login.png");
        Enter = new JButton(EnterButtonImg);
        Enter.setFont(new  Font("serif",Font.BOLD,30));
        Enter.setBorderPainted(false);
        Enter.setFocusable(false);
        Enter.setBounds(600,345,50,50);
        Enter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Enter.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\butt\\loginH.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Enter.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\butt\\login.png"));
            }
        });
        Enter.addActionListener(this);
        backgroundImg.add(Enter);

        ImageIcon CreatbButtonImg = new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\butt\\dnt.png");
        Creatb = new JButton(CreatbButtonImg);
        Creatb.setFont(new  Font("serif",Font.BOLD,30));
        Creatb.setBorderPainted(false);
        Creatb.setFocusable(false);
        Creatb.setBounds(200,440,400,30);
        Creatb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Creatb.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\butt\\dntH.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Creatb.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Project\\Project\\bin\\butt\\dnt.png"));
            }
        });
        Creatb.addActionListener(this);
        backgroundImg.add(Creatb);

        backBtn = new JButton("Back");
        backBtn.setBounds(20,20,100,30);
        backBtn.setBorderPainted(false);
        backBtn.setFocusPainted(false);
        backBtn.setBorder(null);
        backBtn.setBackground(Color.GREEN);
        backBtn.setForeground(null);
        backBtn.addActionListener(this);
        backgroundImg.add(backBtn);

        //adding text Field
        un = new JTextField();
        un.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		un.setBounds(352,312,231,43);
		backgroundImg.add(un);

        pw = new JPasswordField();
        pw.setFont(new  Font("Comic Sans MS",Font.BOLD,30));
		pw.setBounds(352,380,231,43);
		backgroundImg.add(pw);
       


    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==Enter)
        {
            String userName =un.getText();
            String userPassword = pw.getText();
            //for Admin
            if(userName.equals("admin"))
            {
                if(userPassword.equals("admin"))
                {
                    JOptionPane.showMessageDialog(null, "Login Successful");
					adsec a = new adsec();
					this.setVisible(false);
					a.setVisible(true);	
                }
                else{JOptionPane.showMessageDialog(null, "Check Password");}
            }
            else{JOptionPane.showMessageDialog(null, "Check User Name");}
        }
        //else if(ae.getSource()==Creatb)
        //{
            //this.setVisible(false);
            //CreateAccountSection CAS = new CreateAccountSection();
            //CAS.setVisible(true);
        //}
        //else if(ae.getSource()==backBtn)
        //{
            //this.setVisible(false);
            //Selection s = new Selection();
            //s.setVisible(true);
        //}
    }
}
