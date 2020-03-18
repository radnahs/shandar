/**
 *
 * <p>Project: trunk_rytry </p>
 * <p>Package Name: com.shandar.rytry.utils.swing </p>
 * <p>File Name: QuitButtonExample.java</p>
 * <p>Create Date: Aug 5, 2013 </p>
 * <p>Create Time: 8:08:45 PM </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company:  </p>
 * @author Shantanu Sikdar
 * @version 1.0
 */
package com.shandar.rytry.utils.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author Shantanu Sikdar 
 *
 */
public class QuitButtonExample extends JFrame{
	
	public QuitButtonExample(){
		initUI();
	}
	
	private void initUI(){
		JPanel jp = new JPanel();
		getContentPane().add(jp);
		
		jp.setLayout(null);
		
		JButton jb = new JButton("Quit");
		jb.setBounds(50,60,80,30);
		
		jb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		jp.add(jb);
		
		setTitle("Quit Button");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Runnable() {			
			@Override
			public void run() {
				QuitButtonExample qbe = new QuitButtonExample();
				qbe.setVisible(true);
			}
		});
	}

}
