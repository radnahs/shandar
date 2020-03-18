/**
 * <p>Project: com.shandar.tryout.cdkglobal </p>
 * <p>Package Name: com.shandar.tryout.cdkglobal </p>
 * <p>File Name: Problem9.java </p>
 * <p>Create Date: May 10, 2017 </p>
 * <p>Create Time: 8:52:08 PM </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company:  </p>
 * @author Shantanu Sikdar
 * @version 1.0
 */
package com.shandar.tryout.cdkglobal;

/**
 * @author: Shantanu Sikdar
 */
public class Problem9 {

	public static void main(String[] args) {
		System.out.println(fun("abccatcowcatcatxyz","cat"));
	}
	
	public static int fun(String str, String sub){
		System.out.println("str = "+str+" sub = "+sub);
		if(str.length()<sub.length()){
			System.out.println("1st if");
			return 0;
		}
		if(str.startsWith(sub) && str.endsWith(sub)){
			System.out.println("2nd if");
			return str.length();
		}
		if(str.startsWith(sub)){
			System.out.println("3rd if");
			return fun(str.substring(0,str.length()-1),sub);
		}else{
			return fun(str.substring(1),sub);
		}
	}

}
