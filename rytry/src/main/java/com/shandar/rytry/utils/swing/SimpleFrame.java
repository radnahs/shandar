/**
 *
 * <p>Project: trunk_rytry </p>
 * <p>Package Name: com.shandar.rytry.utils.swing </p>
 * <p>File Name: ShanFrame.java</p>
 * <p>Create Date: Aug 5, 2013 </p>
 * <p>Create Time: 6:50:05 PM </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company:  </p>
 * @author Shantanu Sikdar
 * @version 1.0
 */
package com.shandar.rytry.utils.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author Shantanu Sikdar 
 *
 */
public class SimpleFrame extends JFrame{
	
	public SimpleFrame(){
		setTitle("Shantanu Frame");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Runnable() {			
			@Override
			public void run() {
				SimpleFrame sf = new SimpleFrame();
				sf.setVisible(true);
			}
		});

	}

}
