/**
 * <p>Project: com.shandar.tryout.cdkglobal </p>
 * <p>Package Name: com.shandar.tryout.cdkglobal </p>
 * <p>File Name: Problem3.java </p>
 * <p>Create Date: May 10, 2017 </p>
 * <p>Create Time: 9:36:06 PM </p>
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
public class Problem3 {

	public static void main(String[] args) {
		//int arr1[][] = new int[5][5]; 
		//int[] arr2[] = new int[5][5];
		//int[] arr3 = new int[5][];
		//int[] arr4 = new int[][5];
//		System.out.println("public class main");
		TestMainParent testMainParent = new TestMainParent();
		testMainParent.main(new String[]{"TestMainParent"});
		testMainParent.main(new int[]{1,2,4,5});
		
		TestMainChild testMainChild = new TestMainChild();
		testMainChild.main(new String[]{"TestMainChild"});
		testMainChild.main(new int[]{1,2,3,5});
		
		TestMainParent testMainParentChild = new TestMainChild();
		testMainParentChild.main(new String[]{"TestMainParentChild"});
		testMainParentChild.main(new int[]{1,2,4,5,6});
		
	}

}
class TestMainParent{
	
	public static void main(String[] args) {
		System.out.println("class TestMainParent");
	}
	
	public void main(int[] args) {
		System.out.println("integer class TestMainParent");
	}
}
class TestMainChild extends TestMainParent{
	
	public static void main(String[] args) {
		System.out.println("class TestMainChild");
	}
	
	@Override
	public void main(int[] args) {
		System.out.println("integer class TestMainChild");
	}
}