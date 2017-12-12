package com.Mitnick.designmodel.factory.abstractfac;

/**
 * 抽象工厂模式
 * 
 * 具体产品2A 属于抽象产品Product2
 * 
 * @author niezhenjie
 * 
 */
public class Product2A implements Product2{

	@Override
	public void method2() {
		System.out.println("this is Product2A , belonging Product2");
	}

}
