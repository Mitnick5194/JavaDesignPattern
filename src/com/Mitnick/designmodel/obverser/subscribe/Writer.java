package com.Mitnick.designmodel.obverser.subscribe;

import java.util.Observable;

/**
 * 观察者模式
 * 
 *使用jdk提供的接口和类  这是被观察者 需要继承jdk的被观察者的类
 *
 *模拟作者和读者之间的订阅与发布的关系
 * 
 * @author Mitnick
 * 
 */
public class Writer extends Observable{
	private String m_Name;
	private String m_LastBook;
	public Writer(String name){
		super();
		m_Name = name;
		//一旦创建了一个Writer实例 则将它放入Managerwriter中进行管理
		ManagerWriter.getInstance().addWriter(this);
	}
	
	public void publishNewBook(String bookName){
		m_LastBook = bookName;
		//发布了新书 记得通知所有的读者
		setChanged(); //调用父类的发生了变化函数
		notifyObservers(); //调用父类的通知方法
	}
	
	
	public String getName(){
		return m_Name;
	}
	public String getLastBook(){
		return m_LastBook;
	}

}
