package net.tencent.demo.test;

public class Test数据类型 {

	public static void main(String[] args) {

		/**
		 * 数据类型：
		 * 基本数据类型：4类8种基本数据类型
		 * 
		  * 基本数据类型：数值类型(byte short int long) 字符类型(char)  布尔类型(boolean)
		 * //它们在内存中的房间有多大？
		 * byte:1个字节8位  0000 0000
		 * short:2个字节16位 0000 0000 0000 0000
		 * int:4个字节32位 0000 0000 0000 0000 0000 0000 0000 0000
		 * long:8个字节64位 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
		 * char:2个字节16位 0000 0000 0000 0000
		 */
		
		byte b1 = 20;//十进制
		byte b2 = 0b10;//二进制
		byte b3 = 017;//八进制 0开头 ，0~7
		byte b4 = 0x1f;//十六进制数：0 ~ 9  A ~ F, 注：必须以0x或0X开头
		
		System.out.println("byte min value: " + Byte.MIN_VALUE);
		System.out.println("byte max value: " + Byte.MAX_VALUE);
		
		short s1 = 1234;
		short s2 = 0b1000;//二进制
		short s3 = 01234;//八进制
		short s4 = 0x3f;//十六进制
		System.out.println("short min value: " + Short.MIN_VALUE);
		System.out.println("short max value: " + Short.MAX_VALUE);
		
		
		
		int t1 = 1000;
		int t2 = 0b0101;//二进制
		int t3 = 034567;//八进制
		int t4 = 0X9ef;//十六进制
		int t5 = 'q';//查询对应的ASCII码表得到对应的int值
		int t6 = '\u1234';//查询对应的ASCII码表得到对应的int值
		int t7 = '\n';//查询对应的ASCII码表得到对应的int值
		System.out.println("int min value:" + Integer.MIN_VALUE);//-2147483648
		System.out.println("int max value:" + Integer.MAX_VALUE);//2147483647
		
		//隐式转换是自动进行的，从小房间搬到大房间，不会造成精度丢失
		long g1 = 100;//首先内存开辟咯一个32位房间，住着100，然后自动把房间升级到64位，给到g1
		//1000L java虚拟机认为它就是long型，直接给64位房间，不会隐式转换
		long g2 = 1000L;//long型赋值一般会在后面加个L，表示告诉java虚拟机这是long类型，不会发生隐式转换
		// 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
		// ---- ---- ---- ---- ---- ---- ---- ---- 0000 0000 0000 0000 0000 0000 0000 0000
		//显式转换是手动进行的，也叫做强制转换，从大房间搬到小房间，会造成精度丢失
		int w = (int) g1;//这样会造成精度丢失
		System.out.println("long min value: " + Long.MIN_VALUE);//-9223372036854775808
		System.out.println("long max value: " + Long.MAX_VALUE);//9223372036854775807
		
		
		float f1 = 12;
		//float f2 = 12.34;这种会报错原因是默认是double 64位，float是32位，有如下两种解决方法
		float f2 = 12.34F;
		float f3 = (float)1.23;//1.23默认是double需要强制转换
		float f4 = 12.34E2F;
		float f5 = '2';//隐式转换 '2'先转换成int再转换成float，自动进行
		float f6 = '\u1234';//隐式转换 '\u1234'先转换成int再转换成float，自动进行
		
		double d1 = 123.45;
		double d2 = 123;
		double d3 = '2';
		
		int abc = (int)d1;
		System.out.println("abc:" + abc);//123
		//哪些情况自动转换：
		//byte ---> short ---> int ---> long 
		//byte ---> short ---> float ---> double
		//char ---> float
		//char ---> double 
		
		// 哪些情况需要强制转换？只要大房间搬到小房间就需要强制转换，就会丢失精度
		
		
		//char类型
		
		/*
		 * 单个字符用 char 类型表示，通常取值可为：
		 *  英文字母、数字、转义序列、特殊字符等 
		 *  Java中的字符占两个字节(16位)，
		 *  因此可用十六进制编码形式表示
		 * Java中的字符类型的值通常用单引号( ‘ ’ )括起来
		 */
		char c1 = 'c';
		char c2 = '4';
		char c3 = 0x123;//需要查询ASCII码表
		char c4 = '\t';
		char c5 = '问';
		char c6 = '\u2345';//需要查询unicode码表
		char c7 = 86;//需要查询ASCII码表
		System.out.println("char min value: " + Character.MIN_VALUE);// (空格)
		System.out.println("char max value: " + Character.MAX_VALUE);//?
		
	}
}
