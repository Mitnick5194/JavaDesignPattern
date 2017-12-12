package com.Mitnick.designmodel.factory.abstractfac;

/**
 * 抽象工厂模式
 * 
 * 这是具体的工厂 这个工厂能生产两种抽象的产品Product1 和 Product2
 * 
 * 在这里我们生产呢过Product1A和Product2A
 * 
 * 因为每个方法只能生产抽象产品对应的具体产品中的一个（废话 只能返回一个值）
 * 
 * 所以我们要继续生产 Product1B Product2B Product1C Product2C........就要相应的添加具体的工厂 Creator2 Creator3 Creator4....
 * 
 * @author Mitnick
 * 
 */
public class Creator1 implements Creator {

	@Override
	public Product1 createproduct1() {
		return new Product1A();
	}

	@Override
	public Product2 createproduct2() {
		// TODO Auto-generated method stub
		return new Product2A();
	}

}
