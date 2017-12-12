package com.Mitnick.designmodel.factory.abstractfac;

/**
 * 抽象工厂模式
 * 
 * 这是总工厂 总工厂里里面含有创建抽象产品的方法 有多少种抽象产品 
 * 
 * 就应该对应有多少个方法 （这应该很好理解）
 * 
 * @author Mitnick
 * 
 */
public interface Creator {

	Product1 createproduct1();
	Product2 createproduct2();
}
