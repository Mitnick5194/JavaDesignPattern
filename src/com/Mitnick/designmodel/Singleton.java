package com.Mitnick.designmodel;

/**
 * 最简单的单例（懒汉模式 线程不安全）
 * 
 * @author niezhenjie
 * 
 */
public class Singleton {
	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (null == singleton) {
			return new Singleton();
		}
		return singleton;
	}

}

/**
 * 线程安全 这样的设计会造成很多无谓的等待 因为不管单例的实例有没有被创建
 * 
 *   都会进入同步锁 造成无谓的资源消耗 所以应该设计成双层锁
 * 
 * @author mitnick
 *
 */
class Singleton2 {
	private static Singleton2 instance = null;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (null == instance) {
			instance = new Singleton2();
		}
		return instance;
	}
}

/**
 * 双层锁
 * 
 * 为什么需要两层null判断呢： 因为当两个进程同时进入同步块时，只有一个线程拿到了锁 然后进入执行代码块， 此时
 * 另一个线程在等待锁的释放，一旦第一个线程实例化完成后 释放锁 此时单例已经被实例化了
 * 第二个线程拿到了锁，进入代码块，若此时不加null判断，则会再次实例化单例 造成内存中有两个单例的实例
 * 
 * @author mitnick
 *
 */
class Singleton3 {
	private static Singleton3 instance = null;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (null == instance) {
			synchronized (Singleton3.class) {
				if (null == instance) {
					instance = new Singleton3();
				}
			}

		}
		return instance;
	}
}

/**
 * 饿汉模式
 * 
 * 这种模式在jvm以启动时 就创建了单例的实例，所以不存在线程安不安全的问题（可以说是 天生的线程安全）
 * 
 * 不过这个方法不管单例会不会用到都有一份存在内存，一定程度是上会造成内存的浪费 但在某种情况下需要用到这种方法
 * 
 * 比如 在应用启动时就需要加载的配置文件等，就可以采取这种方式去保证单例
 * 
 * @author mitnick
 *
 */
class Singleton4 {
	private static Singleton4 instance = new Singleton4();

	private Singleton4() {
	}

	public Singleton4 getInstance() {
		return instance;
	}

}
