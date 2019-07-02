package net.tencent.demo.test;

public class Test赋值运算符 {

	public static void main(String[] args) {
     
		//赋值运算符：=、+=、﹣=、*=、/=、%=
		int a = 2;
		int b = 1;
		b += a;//给b重新赋值 b = b+a;
		int c = 2;
		c -= a;//c = c-a
		int d = 3;
		d *= a;//d = d*a
		int e = 4;
		e /= a;//e = e/a
		int f = 10;
		f %= a;//f = f%a
		
		/**
		 * 注意：以后这种写法比较多： b += a; 这种写法比较少 b = b + a;
		 * 原因：计算机执行第一种写法速度快;
		 */
	}
}
