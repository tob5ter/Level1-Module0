package _01_methods._1_houses;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot("mini");
	
	public void run() {
		//repeats ten times for the amount of houses
		rob.setX(200);
		rob.setY(200);
		rob.penDown();
		rob.setSpeed(50);
		for(int i=0;i<10;i++) {
			int size = JOptionPane.showOptionDialog(null, "What size do you want your house to be? ",  null, 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Small", "Medium", "Large" }, null);
			int color = JOptionPane.showOptionDialog(null, "What color do you want your house to be? ",  null, 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Black", "Red", "Blue" }, null);
			if(size==0&&color==0) {
				rob.setPenColor(0,0,0);
				drawSmallFlat();
			}
			else if(size==0&&color==1) {
				rob.setPenColor(161, 26, 16);
				drawSmallFlat();
			}
			else if(size==0&&color==2) {
				rob.setPenColor(48, 123, 166);
				drawSmallFlat();
			}
			else if(size==1&&color==0) {
				rob.setPenColor(0,0,0);
				drawMedFlat();
			}
			else if(size==1&&color==1) {
				rob.setPenColor(161, 26, 16);
				drawMedFlat();
			}
			else if(size==1&&color==2) {
				rob.setPenColor(48, 123, 166);
				drawMedFlat();
			}
			else if(size==2&&color==0) {
				rob.setPenColor(0,0,0);
				drawTallFlat();
			}
			else if(size==2&&color==1) {
				rob.setPenColor(161, 26, 16);
				drawTallFlat();
			}
			else if(size==2&&color==2) {
				rob.setPenColor(48, 123, 166);
				drawTallFlat();
			}
		}
		
	}
	public void drawTallFlat() {
		rob.move(100);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(100);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
}
	public void drawMedFlat() {
		rob.move(75);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(75);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
	}
	public void drawSmallFlat() {
		rob.move(50);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(50);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
	}
}	
