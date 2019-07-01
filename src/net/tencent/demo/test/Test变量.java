package net.tencent.demo.test;

public class Test变量 {

	public static void main(String[] args) {
		/**
		 * 1. 变量的意义：临时的数据存放空间
		 */
		
		int age = 23;
		
		if(age > 20) {
			System.out.println("大学生");
		}else if(age < 18) {
			System.out.println("高中生");
		}else {
			System.out.println("初中生");
		}
		
		
		Byte age3;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		Short age4;
		System.out.println(Short.MIN_VALUE);//-32768
		System.out.println(Short.MAX_VALUE);//32768
	}

}
