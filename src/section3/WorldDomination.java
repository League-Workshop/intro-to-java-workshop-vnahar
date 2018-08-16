package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer =JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(answer.equals("yes")) {
	JOptionPane.showMessageDialog(null, "You will rule the world");
}
		// 3. Otherwise, wish them good luck washing dishes.
else if(answer.equals("no")) {
JOptionPane.showMessageDialog(null, "good luck washing my dishes");
}
else{
	JOptionPane.showMessageDialog(null, "only answer yes or no, please click the run button to answer the question again to determiine your future");
	
	
}




	}
}

