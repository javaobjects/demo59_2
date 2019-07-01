package net.tencent.demo.test;

public class HelloWorld {
	
	{
		for (int i = 0; i < 10; i++) {
			if( i % 2 == 0) {
				System.out.println("我是偶数: " + i);
			}
		}
	}
	
	static {
		if(true) {
			System.out.println("true");
		}
	}

	//main alt ---> / 自动生成
	public static void main(String[] args) {
		

		System.out.println();//syso ---> alt + /
		
		int a = 100;
		
		int b = 200;
		
		a = a + b;
		
		b = a + 300;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
