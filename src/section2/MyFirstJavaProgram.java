package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
	Robot wing=new Robot("batman");
	wing.setSpeed(100);
	wing.setPenColor(Color.blue);
	wing.setPenWidth(5);
	wing.penDown();
	for(int i=0;i<4;i++){
		wing.move(200);
		wing.turn(90);
	}
	}
}
