package com.Mitnick.designmodel.factory.method;

/**
 * 工厂方法模式
 * 
 * 客户端
 * 
 * @author Mitnick
 * 
 */
public class Client {

	public static void main(String[] args) {
		//用户1需要lightA
		//实例化lightA的工厂
		Creator creatorA = new LightACreator();
		//用creatorA生产lightA
		Light lightA = creatorA.createLight();
		lightA.turnOn();
		lightA.turnOff();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		//用户2需要lightA
		Creator creatorB = new LightBCreator();
		LightB lightB = (LightB) creatorB.createLight();
		lightB.lightbMethod();
		lightB.turnOn();
		lightB.turnOff();
	}
}
