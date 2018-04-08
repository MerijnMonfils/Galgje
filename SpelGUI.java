package view;

import java.awt.Dimension;

import javax.swing.JFrame;

import controller.Spel;
import model.Woordenlijst;

public class SpelGUI extends JFrame {
	private Spel spel;
	private Woordenlijst lijst;

	public SpelGUI(Spel spel, Woordenlijst lijst) {
		this.spel = spel;
		this.lijst = lijst;
		
		OverzichtGUI overzicht = new OverzichtGUI(this);
		SpelinvoerGUI invoer = new SpelinvoerGUI();
		GalgGUI galg = new GalgGUI();
		
		this.setContentPane(overzicht);
		
		create();
	}
	
	
	private void create() {
		this.setTitle("Galgje");		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(900,900));
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

}
