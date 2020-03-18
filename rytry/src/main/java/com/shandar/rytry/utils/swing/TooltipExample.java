/**
 *
 * <p>Project: trunk_rytry </p>
 * <p>Package Name: com.shandar.rytry.utils.swing </p>
 * <p>File Name: TooltipExample.java</p>
 * <p>Create Date: Aug 5, 2013 </p>
 * <p>Create Time: 8:23:42 PM </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company:  </p>
 * @author Shantanu Sikdar
 * @version 1.0
 */
package com.shandar.rytry.utils.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author Shantanu Sikdar 
 *
 */
public class TooltipExample extends JFrame{

	public TooltipExample(){
		initUI();
	}
	
	private void initUI(){
		JPanel jp = new JPanel();
		getContentPane().add(jp);
		
		jp.setLayout(null);
		jp.setToolTipText("Panel container");
		
		JButton jb = new JButton("Button");
		jb.setBounds(50,60,80,30);
		jb.setToolTipText("Button component");
		
		jp.add(jb);
		
		setTitle("Tool Tip");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Runnable() {			
			@Override
			public void run() {
				TooltipExample te = new TooltipExample();
				te.setVisible(true);
			}
		});

	}

}
