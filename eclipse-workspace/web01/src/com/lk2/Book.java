package com.lk2;
/**
 * 写一个书名类，包含他的属性；
 * @author mac1094
 *
 */
public class Book {
	private static final long serialVersionUID=1l;
	private String id;
	private String name;
	public Book() {
		super();
		
	}
	public Book(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
