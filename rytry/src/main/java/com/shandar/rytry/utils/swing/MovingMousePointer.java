/**
 *
 * <p>Project: rytry_trunk </p>
 * <p>Package Name: com.shandar.rytry.utils.swing </p>
 * <p>File Name: MovingMousePointer.java</p>
 * <p>Create Date: Oct 15, 2012 </p>
 * <p>Create Time: 8:45:55 PM </p>
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

import javax.swing.JFrame;

/**
 * @author Shantanu Sikdar 
 *
 */
public class MovingMousePointer extends JFrame {
	
	private static final long serialVersionUID = -7638723394450681752L;
	
	int count = 0;
	javax.swing.Timer timer;
	Robot robot;

	public MovingMousePointer() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		changeCursorLocation();
	}

	public void changeCursorLocation() {
		try {
			robot = new Robot();
			final int W = getWidth();
			final int H = getHeight();
			ActionListener al = new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					if (count > 20)
						;
					count++;
					robot.mouseMove((int) (Math.random() * W),
							(int) (Math.random() * H));
				}
			};
			timer = new javax.swing.Timer(500, al);
			timer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MovingMousePointer();
	}

}
