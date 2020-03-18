/**
 *
 * <p>Project: trunk_rytry </p>
 * <p>Package Name: com.shandar.rytry.utils.swing </p>
 * <p>File Name: SimpleMenuExample.java</p>
 * <p>Create Date: Aug 5, 2013 </p>
 * <p>Create Time: 8:44:08 PM </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company:  </p>
 * @author Shantanu Sikdar
 * @version 1.0
 */
package com.shandar.rytry.utils.swing;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 * @author Shantanu Sikdar 
 *
 */
public class SimpleMenuExample extends JFrame {
	
	public SimpleMenuExample(){
		initUI();
	}
	
	private void initUI(){
		
		JMenuBar menubar = new JMenuBar();
		//ImageIcon icon = new ImageIcon(getClass().getResource());
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		JMenu quit = new JMenu("Quit");
		quit.setMnemonic(KeyEvent.VK_F);
		
		JMenu mailSendType = new JMenu("Mail Send Type");
		mailSendType.setMnemonic(KeyEvent.VK_F);
		
		JMenu mailFetchType = new JMenu("Mail Fetch Type");
		mailFetchType.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem mstSMTPMenuItem = new JMenuItem("SMTP");
		JMenuItem mstSSLMenuItem = new JMenuItem("SSL");
		JMenuItem mstTLSMenuItem = new JMenuItem("TLS");
		
		JMenuItem eMenuItem = new JMenuItem("Exit");
		eMenuItem.setMnemonic(KeyEvent.VK_F);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		quit.add(eMenuItem);
		menubar.add(file);
		menubar.add(quit);
		
		setJMenuBar(menubar);
		
		setTitle("Simple Menu");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SimpleMenuExample sme = new SimpleMenuExample();
				sme.setVisible(true);
			}
		});
	}

}
