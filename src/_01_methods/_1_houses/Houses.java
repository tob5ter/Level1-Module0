package _01_methods._1_houses;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		Robot rob = new Robot("mini");
		int size = 0;
		rob.setX(300);
		rob.setY(300);
		rob.penDown();
		rob.setSpeed(20);
		rob.setPenColor(0,0,0);
		String houses = JOptionPane.showInputDialog("How many houses would you like to draw?");
		int houseNum = Integer.parseInt(houses);
		String select = JOptionPane.showInputDialog("What size would you like your houses to be?(Small,Medium,Large)");
		if(select.equals("Small")) {
			size = 10;
		}
		else if(select.equals("Medium")) {
			size = 15;
		}
		else if(select.equals("Large")){
			size = 20;
		}
		for(int n=0;n<houseNum;n++) {
			rob.move(10);
			for(int i=0;i<3;i++) {
				rob.move(size);
				rob.turn(90);
				if(i%3==0) {
					rob.turn(-180);
				}
			}
		}
		
		
		// Check the recipe to find out what code to put here
	}
}
