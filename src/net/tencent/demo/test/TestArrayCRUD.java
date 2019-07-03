package net.tencent.demo.test;

import java.util.Arrays;

public class TestArrayCRUD {

	public static void main(String[] args) {

		/**
		 * CRUD:增删改查
		 * 数组的增删改查
		 * 1.数组的元素的添加
		 * 2.数组的元素的删除，同修改
		 * 3.数组的元素的修改，同删除操作
		 * 4.查询:通过索引访问数组中的元素
		 */
		//1、数组的元素的添加是不可能的，因为数组一但初始化长度不能改变
		int[] a = new int[3];
		
	    //a[3] = 23;//抛出异常，索引越界异常
		
		int[] b = {1234,456,789};
		//如何删除789这个元素？
		b[2] = 0;//也不能删除，只能更改其值
		System.out.println(Arrays.toString(b));//[1234,456,0]
		//========================================
		int[] p = {123,456,789};
		int[] z;
		//需求：如何把p数组中的元素全部放入z数组？
		//方案一：
		z = new int[p.length];
		
//		for (int i = 0; i < z.length; i++) {
//			z[i] = p[i];
//		}
//		System.out.println(Arrays.toString(z));//[123, 456, 789]
		
		//方案二：
		System.arraycopy(p, 0, z, 0, 3);//源数组 ，源数组开始下标，目标数组，目标数组开始下标，需要复制多少个[123, 456, 789]
		System.out.println(Arrays.toString(z));
		
	}

}
