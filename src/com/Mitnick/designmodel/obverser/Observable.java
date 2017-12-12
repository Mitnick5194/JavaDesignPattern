package com.Mitnick.designmodel.obverser;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察着模式1
 * 
 * 这是被观察者 被观察者需要有一个列表 保存所有观察他的对象
 * 
 * 还要有一个通知的方法 执行该方法就会使所有观察他的对象的Observer接口方法被执行
 * 
 * @author Mitnick
 * 
 */
public class Observable {
	
	List<Observer> observers = null;
	
	public Observable(){
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * 添加观察者
	 * @param o
	 */
	public void addObserver(Observer o){
		observers.add(o);
	}
	
	/**
	 * 移除一个观察者
	 * @param o
	 */
	public void removeObserver(Observer o){
		observers.remove(o);
	}
	
	/**
	 * 核心方法 当观察者变化时 会做出通知
	 */
	public void changed(){
		System.out.println("被观察者已经发生了变化，接下来会通知所有的观察者");
		notifyObservers();
	}
	
	/**
	 * 核心方法 用此方法通知所有的观察者
	 */
	public void notifyObservers(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
	
	

}
