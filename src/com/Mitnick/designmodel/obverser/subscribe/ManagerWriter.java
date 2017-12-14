package com.Mitnick.designmodel.obverser.subscribe;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 观察者模式
 * 
 * 这是一个管理被观察者的类 以方便观察者获取被观察者 
 * 
 * 这个实例在内存中只需要有一份就行了 所以使用单例
 * 
 * @author Mitnick
 * 
 */
public class ManagerWriter {
	
	private static ManagerWriter managerWriter = null;
	
	Map<String , Writer> writerMap = null;
	
	private ManagerWriter(){
		writerMap = new HashMap<String , Writer>();
	}
	
	/**
	 * 取得一个ManagerWriter实例（这个内存共享一份此实例）
	 * @return
	 */
	public static ManagerWriter getInstance(){
		if(null == managerWriter){
			synchronized (ManagerWriter.class) {
				if(null == managerWriter){
					managerWriter = new ManagerWriter();
				}
			}
		}
		return managerWriter;
	}
	
	public void addWriter(Writer writer){
		writerMap.put(writer.getName(), writer);
	}
	public Writer getWriter(String name){
		return writerMap.get(name);
	}
	

}
