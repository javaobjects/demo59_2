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
	}

}
