package JavaProgs;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AWTExample {

	AWTExample() {
		login();
	}

	static void login() {
		Frame f = new Frame("Login Page");

		Label namel = new Label("Name");
		namel.setBounds(30, 30, 100, 20);

		TextField name = new TextField();
		name.setBounds(30, 50, 200, 30);

		Label passl = new Label("Password");
		passl.setBounds(30, 110, 210, 20);

		TextField pass = new TextField();
		pass.setBounds(30, 130, 210, 30);
		pass.setEchoChar('*');

		Button login = new Button("Login");
		login.setBounds(30, 170, 70, 30);

		Button registerPage = new Button("Register Page");
		registerPage.setBounds(120, 170, 120, 30);

		f.add(name);
		f.add(namel);
		f.add(passl);
		f.add(pass);
		f.add(login);
		f.add(registerPage);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(login)) {
					System.out.println("Name - " + name.getText().toString() + "\nPassword - "
							+ pass.getText().toString());
					if (name.getText().equals("Ishaan") && pass.getText().equals("abcde")) {
						// f.dispose();
					}
				}

			}
		});

		registerPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				register();
			}
		});

		f.setSize(600, 600);
		f.setLayout(null);
		f.setTitle("Login Page :)");
		f.setVisible(true);
	}

	
	static void register() {
		Frame f = new Frame("Register Page");
		f.setSize(600, 600);
		f.setLayout(null);
		f.setTitle("Register Page :)");
		f.setVisible(true);

		Label namel = new Label("Name");
		namel.setBounds(30, 30, 100, 20);

		TextField name = new TextField();
		name.setBounds(30, 50, 200, 30);

		Label passl = new Label("Password");
		passl.setBounds(30, 100, 210, 20);

		TextField pass = new TextField();
		pass.setBounds(30, 120, 210, 30);
		pass.setEchoChar('*');

		Label confirmpassl = new Label("Confirm Password");
		confirmpassl.setBounds(30, 170, 210, 20);

		TextField confirmpass = new TextField();
		confirmpass.setBounds(30, 190, 210, 30);
		confirmpass.setEchoChar('*');

		Label phnol = new Label("Phone Number");
		phnol.setBounds(30, 240, 210, 20);

		TextField phno = new TextField();
		phno.setBounds(30, 260, 210, 30);

		Button register = new Button("Register");
		register.setBounds(20, 300, 90, 30);

		Button loginPage = new Button("Login Page");
		loginPage.setBounds(120, 300, 110, 30);

		f.add(name);
		f.add(namel);
		f.add(passl);
		f.add(pass);
		f.add(register);
		f.add(confirmpass);
		f.add(confirmpassl);
		f.add(phnol);
		f.add(phno);
		f.add(loginPage);

		phno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)
					e.consume();
			}
		});

		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(register)) {
					if(!pass.getText().toString().equals(confirmpass.getText().toString())) {
						System.out.println("Passwords do not match");
						return;
					}
					System.out.println("Name - " + name.getText().toString() + "\nPassword - "
							+ pass.getText().toString() + "\nPhone No. - "
							+ phno.getText().toString());
				}

			}
		});

		loginPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				login();
			}
		});
	}

	public static void main(String[] args) {
		AWTExample aw = new AWTExample();
	}
}
