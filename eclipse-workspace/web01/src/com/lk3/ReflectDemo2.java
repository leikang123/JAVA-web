package com.lk3;

import java.lang.reflect.Constructor;

/**
 * 反射的属性和方法的使用
 * 要实例化对象，先要实例化类名；再实例化对象
 * @author mac1094
 *
 */

public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.lk3.Person");
		// 通过反射获取全部构造方法
		Constructor cs[] =clazz.getConstructors();
		//实例化对象
		Person p=(Person) cs[0].newInstance("老李",24);
		
		
		System.out.println(p);
		
		
	}

}
