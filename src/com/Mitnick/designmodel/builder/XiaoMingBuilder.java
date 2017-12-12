package com.Mitnick.designmodel.builder;

/**
 * 建造着模式
 * 
 * 具体的建造实例 需要实现建造者然后对具体实例进行建造
 * 
 * @author niezhenjie
 * 
 */
public class XiaoMingBuilder implements PersonBuilder {

	Person person = null;

	public XiaoMingBuilder(){
		person = new Person();
	}

	
	@Override
	public void buildName() {
		person.setName("小明");
	}

	@Override
	public void buildBody() {
		System.out.println("建造小明的身体");
		person.setBody("建造小明的身体");
	}

	@Override
	public void buildHead() {
		System.out.println("建造小明的头");
		person.setBody("建造小明的头");
	}

	@Override
	public void buildFoot() {
		System.out.println("建造小明的脚");
		person.setBody("建造小明脚");
	}

	@Override
	public Person creatPerson() {
		// 返回建造好的小明
		return person;
	}

}
