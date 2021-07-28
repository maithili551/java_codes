package study.GUI;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login implements ActionListener {
	private Label username, password, message;
	private JTextField username1, password1;
	private JButton login, clear;
	
	public Login()
	{
		JFrame frame = new JFrame();
		frame.setTitle("Login Page");
		frame.setLocation(450, 300);
		frame.setLayout(null);
		
		username=new Label("Username: ");
		username.setBounds(20, 50, 80, 30);
		frame.add(username);
		
		password=new Label("Password: ");
		password.setBounds(20, 100, 80, 30);
		frame.add(password);
		
		username1= new JTextField();
		username1.setBounds(110, 50, 100, 30);
		frame.add(username1);
		
		
		password1= new JTextField();
		password1.setBounds(110, 100, 100, 30);
		frame.add(password1);
		
		login= new JButton("Login");
		login.setBounds(80,180,80 ,30);
		login.addActionListener(this);
		frame.add(login);
		
		clear= new JButton("Clear");
		clear.setBounds(190,180,80 ,30);
		clear.addActionListener(this);
		frame.add(clear);
		
		message= new Label();
		message.setBounds(100, 230, 120, 30);
		frame.add(message);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	
	}
	public void check(String p, String u)
	{
		if(p.equals("prudent123") && u.equals("maithili"))
		{
			message.setText("Login Successful!");
			
		}
		else
		{
			message.setText("Login Failed :(");
		}
	}
public static void main(String[] args) {
	new Login();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand().equals("Login"))
	{
		String p=password1.getText();
	    String u= username1.getText();
	    check(p,u);
	}
		
	if (e.getActionCommand().equals("Clear"))
	{
		password1.setText("");
		username1.setText("");
		message.setText("");
	}
	
	
}
}
