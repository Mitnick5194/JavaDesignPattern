package com.Mitnick.designmodel.factory.abstractfac;

/**
 * 抽象工厂模式
 * 
 * 具体产品1A 属于抽象产品Product1
 * 
 * @author niezhenjie
 * 
 */
public class Product1A implements Product1 {

	@Override
	public void method1() {
		System.out.println("this is Product1A , belonging Product1");
	}

}
