package com.Mitnick.designmodel.factory.abstractfac;

/**
 * @author Mitnick
 * 
 */
public class Client {

	public static void main(String[] args) {
		//拿到具体的工厂1 返回总工厂
		Creator c1 = new Creator1();
		//用工厂1生产具体的产品1
		Product1 p1a = c1.createproduct1();
		p1a.method1();
		//用工厂1生产具体的产品2
		Product2 p2a = c1.createproduct2();
		p2a.method2();
		
		//拿到工厂2
		Creator c2 = new Creator2();
		Product1 p1b = c2.createproduct1();
		p1b.method1();
		Product2 p2b = c2.createproduct2();
		p2b.method2();
	}
}
