package com.Mitnick.designmodel.factory.method;

/**
 * @author niezhenjie
 * 
 */
public class Exercise {

	public static void main(String[] args) {
		//this is client
		CreatorExer ac = new CreateproductA();
		Product a = ac.creatproduct();
		a.productmethod();
		
		CreatorExer bc = new CreateproductB();
		Product b = bc.creatproduct();
		b.productmethod();
	}
}

//产品抽象
interface Product{
	void productmethod();
}
//具体产品A
class ProductA implements Product{

	@Override
	public void productmethod() {
		System.out.println("hello i am product A");
	}
}
//具体产品B
class ProductB implements Product{
	
	@Override
	public void productmethod() {
		System.out.println("hello i am product A");
	}
}

//抽象方法
interface CreatorExer{
	Product creatproduct();
}
//具体产品的具体工厂
class CreateproductA implements CreatorExer{

	@Override
	public Product creatproduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}
	
}

//具体产品的具体工厂
class CreateproductB implements CreatorExer{
	
	@Override
	public Product creatproduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}
	
}

