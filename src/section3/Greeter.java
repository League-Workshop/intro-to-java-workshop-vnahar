package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name	=JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null," hi "+ name);
String  age =JOptionPane.showInputDialog("how old are you?");
JOptionPane.showMessageDialog(null, "you are  "+age);
}
}
