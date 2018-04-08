package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OverzichtGUI extends JPanel {
	private JButton play, instructions, settings;
	
	public OverzichtGUI(SpelGUI spel) {
		play = new JButton("Play");
		instructions = new JButton("Instructions");
		settings = new JButton("Settings");
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.setBorder(new EmptyBorder(new Insets(150, 80, 50, 80)));  
		
		setupButtons();
	}
	
	private void setupButtons() {
		play.setAlignmentX(Component.CENTER_ALIGNMENT);
		play.setMaximumSize(new Dimension(300, 100));
		
		instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
		instructions.setMaximumSize(new Dimension(300, 100));
				
		settings.setAlignmentX(Component.CENTER_ALIGNMENT);
		settings.setMaximumSize(new Dimension(300, 100));
		
		this.add(play);
		this.add(Box.createRigidArea(new Dimension(0, 100)));
		this.add(instructions);
		this.add(Box.createRigidArea(new Dimension(0, 100)));
		this.add(settings);
	}

}
