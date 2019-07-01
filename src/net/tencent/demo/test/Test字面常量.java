package net.tencent.demo.test;

public class Test字面常量 {

	public static void main(String[] args) {

		//什么是字面常量？
		
		int a = 100;
		
		String b = "tom";
		
		double c = 123.456;
		
		float d = 12.4F;
		
		String name = "john";
		
		char f = 'a';
		
		char g = 100;//需要查询ascii码表看100对应的字符是什么 输出d
		
		char h = '\u123f';// 需要查询unicode字符表，看这个编码对应的字符是什么 \\u表示 Unicode https://baike.baidu.com/item/Unicode  JAVA Unicode字符列表 
		
		System.out.println("g:" +g);
		System.out.println("h:" +h);
		
		long money = 1_000_000_000;//可以三位一断也可以两位一断也可以一位一断，根据自己习惯
		
		//jdk7以后对这些数值常量的支持：可以使用下划线，增强可读性
		int age = 0B10_10_10_10;//0b/0B都行 0b/0B 开头表示二进制 binary:二进制
		int age2 = 0b1000000;
		
		System.out.println("age: " + age);//170
		System.out.println("age2: " + age2);//64
		
	}

}
