package com.Mitnick.designmodel.decorator;

/** 
 * 装饰器模式
 * 
 * 这个是被装饰的接口的实现类（被装饰的原始类）
 * 
 * 最终的具体装饰类访问的包装后访问的方法就是这里面实现的方法
 * 
 * @author Mitnick
 * 
 */
public class ConcreteComponent implements Component {

	@Override
	public void method() {
		System.out.println("原来的方法");
	}

}
