package com.Mitnick.designmodel.factory.simple;


/**
 * 简单工厂
 * 
 * 工厂类
 * 
 * 这个类会根据用户传入不同的产品名字 相应的返回该产品的实例
 * 当没添加一个产品时，都有告诉该工厂 然后提供一个判断 让工厂生产该产品
 * 
 * @author Mitnick
 * 
 */
public class Creator {

	private Creator() {
	}

	public static ProductInte getProduct(String productname) {
		if ("A".equals(productname)) {
			return new Product();
		} else if ("B".equals(productname)) {
			return new Product2();
		}
		return null;
	}

}
