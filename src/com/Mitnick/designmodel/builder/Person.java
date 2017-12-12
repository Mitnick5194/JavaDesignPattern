package com.Mitnick.designmodel.builder;

/**
 * 建造着模式
 * 
 * 这个是建造者要建造的实例 不直接给建造者使用 只有当一个建造具体
 * 实例的建造者（即实现了建造着的那个类）才需要使用此类（其实是对此类的set方法的再次封装）
 * 
 * @author Mitnick
 * 
 */
public class Person {
	private String name;
	private String body;
	private String head;
	private String foot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

}
