package com.lk3;
/**
 * 反射的属性和方法的使用
 * 要实例化对象，先要实例化类名；再实例化对象
 * @author mac1094
 *
 */

public class ReflectDemo01 {
	public static void main(String[] args) throws Exception {
		//传入要实例化类的完整的名称（包名.类名)
		Class clazz =Class.forName("com.lk3.Person");
		//实例化Person对象
		Person p = (Person)clazz.newInstance();
		p.setName("雷康");
		p.setAge(29);
		System.out.println(p);
		
	}

}
