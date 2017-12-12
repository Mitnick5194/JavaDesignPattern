package com.Mitnick.designmodel.builder;

/**
 * 建造着模式
 * 
 * @author Mitnick
 * 
 */
public class Client {

	public static void main(String[] args) {
		CreatPerson cp = new CreatPerson();
		//建造小明
		cp.creatPerson(new XiaoMingBuilder());
		System.out.println("--------------------------------------------------------------------------");
		//建造小强
		cp.creatPerson(new XiaoQiangBuilder());
	}

}
