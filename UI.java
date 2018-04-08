import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class UI extends JFrame {
	
	JButton but;
	JButton but2;
	public void setOn(boolean on) {
		this.on = on;
	}

	private boolean on;
	
	public boolean isOn() {
		return on;
	}

	autoclicker1 auto = new autoclicker1(this);
	public UI() {

		auto.start();
		
		but = new JButton("Start/stop autoclicker");
		but.setSize(100, 100);
		but.setLocation(10, 20);
		but2 = new JButton("Stop program");
		but2.setSize(100, 100);
		but2.setLocation(150, 20);
		
		but.addActionListener(new ActionListener() {
		
		
			public void actionPerformed(ActionEvent e) {
				if(on) {
					on = false;
				}
				else if(!on) {
					on = true;
					
				}
				System.out.println(on);
			}
			});
		
		but2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		
		add(but2);
		add(but);
		setResizable(false);
		setLayout(new BorderLayout(1, 1));
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		
		UI test = new UI();
		
	}
	
	public void test1() {
		System.out.println(auto.getOn());
	}

	
}
