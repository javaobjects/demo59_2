package net.tencent.demo.test;

public class Test比较运算符 {

	public static void main(String[] args) {

		//比较运算符：>、<、>=、 <=、= =、!=、instanceof
		
		//为了控制程序的运行，在代码中经常使用比较运算符

		int rows = 2;
		
		if(rows == 2) {
			System.out.println("支付成功");
		}else {
			System.out.println("支付失败");
		}
		
		//instanceof：判断某个对象是否是某个类的实例
		//new Test比较运算符();//当前类实例化
		//实例化一个对象
		Animal cat = new Animal();//Animal()这是一个构造方法，
		//只要是new的对象都在堆区，只要是声明一个变量就一定在栈区
		System.out.println(cat instanceof Animal);//cat这个变量是Animal类型的一个对象吗？---> true
		//System.out.println(cat instanceof Student);//因为不是Student类型的对象，所以代码根本不给 过
	}
}
