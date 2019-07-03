package net.tencent.demo.test;

import java.util.Arrays;

public class Test一维数组 {

	public static void main(String[] args) {

		/**
		 * 1、如何声明一个数组
		 * 2、如何给数组赋值
		 * 3、如何访问数组
		 * 4、如何对数组进行增删改查
		 */
		//数组的创建以及增删改查
		//1、声明一个数组并赋值
		
		int[] a;//√
		int b[];//不推荐
		
		//2.数组的初始化
		int[] c = {1,2,300,567};//声明和初始化同时进行
		
		//怎样把数组c中的所有元素打印输出到控制台？Arrays.toString(c)
		System.out.println(Arrays.toString(c));//[1,2,300,567]
		for (int i = 0; i < c.length; i++) {//i : 0-3
			System.out.println("数组c中的元素： " +c[i]);
		}
		
		int[] d = new int[6];//声明和初始化同时进行，只不过数组中的各个元素的值是0
		
		System.out.println(d[4]);//0
		
		double[] e = new double[4];
		
		System.out.println(e[2]);//0.0
		
		boolean[] f = new boolean[3];
		
		System.out.println(f[0]);//false
		
		String[] s = new String[5];
		
		System.out.println(s[2]);//null
		
		char[] h = new char[7];
		System.out.println(h[6]);//'' 空格
		
	}
}
