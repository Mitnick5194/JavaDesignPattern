package com.Mitnick.designmodel.factory.simple;


/**
 * 
 * 简单工厂模式
 * 
 * 具体产品类 需要实现ProductInte
 * 
 * @author niezhenjie
 * 
 */
public class Product implements ProductInte {

	@Override
	public void method() {
		System.out.println("i am product A");
	}
}


/**
 * 
 * 简单工厂模式
 * 
 * 具体产品类 需要实现ProductInte
 * 
 * @author niezhenjie
 * 
 */
class Product2 implements ProductInte{

	@Override
	public void method() {
		System.out.println("i am product B");
		
	}
	
}