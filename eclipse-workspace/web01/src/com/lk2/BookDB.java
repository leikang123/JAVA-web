package com.lk2;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 用于模拟保存图书的数据库
 * @author mac1094
 *
 */

public class BookDB {
	private static Map<String,Book> books=new LinkedHashMap<String,Book>();
	static {
		books.put("1", new Book("1","java开发"));
		books.put("2", new Book("2","java开发基础"));
		books.put("3", new Book("3","java开发实战"));
		books.put("4", new Book("4","中的时间"));
		books.put("5", new Book("5","胃肠"));
	}
public static Collection<Book>getAll(){
	return books.values();
}
public static Book getBook(String id) {
	return books.get(id);
	
}
}
