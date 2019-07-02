package net.tencent.demo.test;

public class Test算术运算符 {

	public static void main(String[] args) {

		//算术运算符： +、﹣、*、/、%、++、 --
		
		//单目运算符： ++ --
		
		int a = 10;
		
		a++;//让a自增 1
		
		System.out.println("a: " + a);//11
		
		a--;
		
		System.out.println("a: " + a);//10
		
		int b = a++;//自增有两种情况:一种是前自增(++a)，先加1，后赋值，一种是后自增(a++)，先赋值，后加1
		

		System.out.println("b: " + b);//10
		
		int c = ++a;
		System.out.println("c: "+c);//12
		
		int d = 100;
		int e = d--;
		
		System.out.println("e: " + e);//e:100
		
		System.out.println("d: " + d);//99
		
		int f = --d;
		System.out.println("d: " + d);//98
		System.out.println("f: " + f);//98
		
		
		int p = 100;
		int h = 20;
		System.out.println(p + h);//120
		System.out.println(p - h);//80
		System.out.println(p * h);//5
		System.out.println(p / h);//2000
		System.out.println(p % h);//0
		
		int k = 12345;
		//需求：如何求出k数字各个数位上数字的和？
		//k%10000 = 2345
		//k/10000 = 1
		int k_w = k/10000;
		int k_k = k % 10000 / 1000;
		int k_b = k % 1000 / 100;
		int k_s = k % 100 / 10;
		int k_g = k % 10;
		
		System.out.println(k_w + k_k + k_b + k_s + k_g);
		
		
		
	}

}
