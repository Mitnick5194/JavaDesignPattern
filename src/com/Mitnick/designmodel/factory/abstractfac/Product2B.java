package com.Mitnick.designmodel.factory.abstractfac;

/**
 * 抽象工厂模式
 * 
 * 具体产品2B 属于抽象产品Product2
 * 
 * @author Mitnick
 * 
 */
public class Product2B implements Product2 {

	@Override
	public void method2() {
		System.out.println("this is Product2B , belonging Product2");
	}

}
