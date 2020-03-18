/**
 *
 * <p>Project: rytry_trunk </p>
 * <p>Package Name: com.shandar.rytry.utils.swing </p>
 * <p>File Name: AutoShutdownAfter.java</p>
 * <p>Create Date: Oct 16, 2015 </p>
 * <p>Create Time: 11:52:21 AM </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company:  </p>
 * @author Shantanu Sikdar
 * @version 1.0
 */
package com.shandar.rytry.utils.swing;

import java.io.IOException;

/**
 * @author Shantanu Sikdar 
 *
 */
public class AutoShutdownAfter {

	public static void main(String[] args) throws InterruptedException, IOException {
		String[] after = "0 2".split(" ");
		System.out.println(after[0]);
		System.out.println(after[1]);
	    if (after.length < 2) {
	        System.out.println("usage: java PCShutdown HOURS MINUTES");
	    }
	    int hours = Integer.parseInt(after[0]);
	    int minutes = Integer.parseInt(after[1]);
	    Thread.sleep(hours * 60 * 60 * 1000 + minutes * 60 * 1000);
	    Runtime.getRuntime().exec("shutdown -s -t 30");
	}
}
