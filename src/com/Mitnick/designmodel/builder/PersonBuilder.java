package com.Mitnick.designmodel.builder;

/**
 * 建造着模式 这是核心接口  每建造一个具体的实例 都要实现该接口
 * 
 * (其他类提到的 “具体建造者” 是指实现了这个接口的类)
 * 
 * @author Mitnick
 * 
 */
public interface PersonBuilder {
	void buildName();
	void buildBody();
	void buildHead();
	void buildFoot();
	Person creatPerson(); //返回具体要建造的实例
}
