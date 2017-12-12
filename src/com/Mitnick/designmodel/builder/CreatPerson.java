package com.Mitnick.designmodel.builder;

/**
 *  建造着模式
 *  
 *  通过传入一个建造者 然后对起进行建造
 *  
 * @author Mitnick
 * 
 */
public class CreatPerson {
	
	public Person creatPerson(PersonBuilder pb){
		pb.buildName();
		pb.buildBody();
		pb.buildHead();
	//	pb.buildFoot();
		return pb.creatPerson();
	}

}
