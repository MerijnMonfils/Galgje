package controller;

import model.Woordenlijst;
import view.SpelGUI;

public class Spel {
	
	public Spel() {
		Woordenlijst lijst = new Woordenlijst();
		SpelGUI mainSpel = new SpelGUI(this, lijst);
		Check check = new Check();
		Computer pc = new Computer();
	}
}
