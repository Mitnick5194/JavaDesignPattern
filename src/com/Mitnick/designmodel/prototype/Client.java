package com.ajie.designmodel.prototype;

/**
 * 
 * 
 * @author Mitnick
 * 
 */
public class Client {
	public static void main(String[] args) {
		SimplePrototype pro = new SimplePrototype();
		pro.change();
		System.out.println("原始的prototype");
		SimplePrototype proclone2 = pro.clone(); // 克隆不会访问被复制的构造函数
		System.out.println("复制的prototype" + proclone2);

		System.out.println("------------------------------------------------------------------");

		ShallowPrototype sp = new ShallowPrototype();
		System.out.println("原来的sp" + sp);
		ShallowPrototype spclone = sp.clone();
		System.out.println("复制的sp" + spclone);
		
		System.out.println("------------------------------------------------------------------");
		
		DeepPrototype dp = new DeepPrototype();
		System.out.println("原来的dp "+dp);
		DeepPrototype dpclone = dp.clone();
		System.out.println("复制的dp "+dpclone);

	}

}
