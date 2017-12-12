package com.Mitnick.designmodel.decorator;

/**
 * 装饰器模式
 * 
 * 定义：装饰模式是在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象
 * 
 * 这是待装饰的接口 可以通过具体的装饰类访问该方法 达到被装饰的效果
 * 
 * 而具体的装饰类需要继承一个抽象类（不一定是抽象 父类就行 其实接口也可以 抽象做父类只是更好维护）
 * 
 * 而这个抽象类则要实现该接口
 * 
 * @author Mitnick
 * 
 */
public interface Component {
	public void method();
}
