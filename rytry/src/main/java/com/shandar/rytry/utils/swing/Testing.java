/** 
 * <p>Project: rytry_trunk </p>
 * <p>Package Name: com.shandar.rytry.utils.swing </p>
 * <p>File Name: Testing.java</p>
 * <p>Create Date: Oct 29, 2012 </p>
 * <p>Create Time: 3:07:47 PM </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company:  </p>
 * @author Shantanu Sikdar
 * @version 1.0
 */
package com.shandar.rytry.utils.swing;

import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * @author Shantanu Sikdar
 */
public class Testing extends JFrame {
	
	int count = 0;
	Timer timer;
	Robot robot;
	private void changeCursorLocation() {
		try {			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setExtendedState(MAXIMIZED_BOTH);
			setVisible(true);			
			robot = new Robot();
			final int W = getWidth();
			final int H = getHeight();
			ActionListener al = new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					if (count > 20)	;
					count++;
					robot.mouseMove((int) (Math.random() * W), (int) (Math.random() * H));
				}
			};
			timer = new javax.swing.Timer(500, al);
			timer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void autoShutdownAfter(int minutes, int hours) throws InterruptedException, IOException{	
	    Thread.sleep(hours * 60 * 60 * 1000 + minutes * 60 * 1000);
	    Runtime.getRuntime().exec("shutdown -s -t 30");		
	}

	public static void main(String[] args)  throws InterruptedException, IOException{
		Testing testing = new Testing();
		testing.changeCursorLocation();
		testing.autoShutdownAfter(1,0);		
	}

}