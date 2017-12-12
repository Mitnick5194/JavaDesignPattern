package com.Mitnick.designmodel.factory;

import com.Mitnick.designmodel.factory.simple.Creator;
import com.Mitnick.designmodel.factory.simple.ProductInte;


/**
 * 
 * 简单工厂模式中的客户端 这是最终与用户交互的类
 * 
 * 
 * @author niezhenjie
 * 
 */
public class Client {

	public static void main(String[] args) {
		//用户1需要A产品
		ProductInte productA = Creator.getProduct("A");
		productA.method();
		
		//用户2需要B产品
		ProductInte productB = Creator.getProduct("B");
		productB.method();
	}
}
