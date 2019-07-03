package net.tencent.demo.test;

public class TestArray1 {

	public static void main(String[] args) {

		//声明一个变量a，整数数组类型
		int[] a = {12,23,44,55,66};
		//声明一个变量b，String数组类型
		String[] b = {"abc","124","666"};
		
		double[] c = {12.34,45.66,77.890,99};
		
		char[] d = {'中','a','\n','\u1234',123};
		
		Student stu1 = new Student();
		
		Student stu2 = new Student();
		
		Student[] e = {stu1,stu2};
		
		
		/**
		 * 1,2,3
		 * 4,5,6
		 * 7,8,9
		 * 
		 * 56,67,345
		 */
		int[] k = {56,67,345};//一维数组
		
		int[][] y = {{1,2,3},{4,5,6},{7,8,9}};//多维数组
		
	}

}
