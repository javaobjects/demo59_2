package net.tencent.demo.test;

/**
 * 动物类
* <p>Title: Animal</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月2日
 */
public class Animal {

	//这是一个构造方法
	public Animal()
	{
		
	}
	
	private int age;
	private String name;
	private double weight;
	private String color;
	//....
	public void walk()
	{
		System.out.println(name + "is walking");
	}
	
	public void sleep()
	{
		System.out.println(name + "is sleeping");
	}
	
	public void eat()
	{
		System.out.println(name + "is eating");
	}
}
