package net.tencent.demo.test;

public class Test乘法口决表 {

	public static void main(String[] args) {

		//输出乘法口决表：
		
		//实现技术，循环的嵌套
		/**
		 * 思路：
		 * 1、循环输出9行
		 * 2、每行循环输出多列，列数等于行数
		 */
		for (int row = 1; row <= 9; row++) {
			for (int coloum = 1; coloum <= row; coloum++) {
				System.out.print(coloum + "X" + row + "=" + coloum * row + "   ");
			}
			System.out.println();
		}
	}

}
