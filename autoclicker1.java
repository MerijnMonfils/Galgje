	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.MouseEvent;
	import java.util.concurrent.ThreadLocalRandom;
	
	public class autoclicker1 extends Thread {
		
		UI u;
		
		boolean on = false;
		private static double max = 3;
		private static double min = 0.8;
		double random;
		
		public autoclicker1(UI u) {
			on = false;
			this.u = u;
		}
		
		public void run() {
			
			while(true) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(u.isOn());
				while(u.isOn()) {
					leftClick();
					randominterval();
					delay(random);
					System.out.println(random);
				
				}
				
			}
		
		}
		
		public void randominterval() {
			
				random = ThreadLocalRandom.current().nextDouble(min, max);
				
		}
		
		
		
		
		private  Robot macro = null;
		
		
		
		public void delay(double seconds) {
			createMacro();
			macro.delay((int)(seconds * 1000.0) );
		}
		
		public void leftClick() {
			createMacro();
			macro.mousePress(MouseEvent.BUTTON1_MASK);
			macro.mouseRelease(MouseEvent.BUTTON1_MASK);
		}
		
		public void createMacro() {
			try {
				macro = new Robot();
			} catch(AWTException e) {
				e.printStackTrace();
			}
		}
		
		
		public void setOn(boolean on) {
			this.on = on;
		}
		
		public  boolean getOn() {
			return on;
		}

	}



