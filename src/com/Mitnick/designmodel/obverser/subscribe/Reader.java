package com.Mitnick.designmodel.obverser.subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 * 
 *使用jdk提供的接口和类 这是观察者 需要实现jdk的观察者类
 *
 * 模拟作者和读者之间的订阅与发布的关系
 * 
 * @author Mitnick
 * 
 */
public class Reader implements Observer{
	private String m_Name;
	public Reader(String name){
		m_Name = name;
	}
	
	public void subscribe(String writer){
		ManagerWriter.getInstance().getWriter(writer).addObserver(this);
	}
	
	/**
	 * 取消订阅
	 */
	public void unsubscribe(String writer){
		ManagerWriter.getInstance().getWriter(writer).deleteObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Writer writer = (Writer)o;
		System.out.println("亲爱的"+m_Name+"： 作者" +writer.getName()+"刚刚发布了新书《"+writer.getLastBook()+"》，快去抢先阅读吧！");
	}
	
	
	public String getName(){
		return m_Name;
	}




}
