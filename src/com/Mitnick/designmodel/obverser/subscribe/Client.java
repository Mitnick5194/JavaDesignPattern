package com.Mitnick.designmodel.obverser.subscribe;

/**
 * 
 * 观察者模式 客户端
 * 
 * @author Mitnick
 * 
 */
public class Client {
	
	public static void main(String[] args) {
		//先来几个作者
		Writer w1 = new Writer("路遥");
		Writer w2 = new Writer("沈从文");
		
		//来几个忠实粉丝
		Reader r1 = new Reader("Mitnick");
		Reader r2 = new Reader("T-mac");
		Reader r3 = new Reader("Yao");
		Reader r4 = new Reader("Kobe");
		Reader r5 = new Reader("Curry");
		
		//订阅
		r1.subscribe(w1.getName());
		r2.subscribe(w1.getName());
		r3.subscribe(w1.getName());
		
		r4.subscribe(w2.getName());
		r5.subscribe(w2.getName());
		
		//路遥出书啦
		w1.publishNewBook("平凡的世界");
		
		//沈从文出书啦
		w2.publishNewBook("围城");
	}

}
