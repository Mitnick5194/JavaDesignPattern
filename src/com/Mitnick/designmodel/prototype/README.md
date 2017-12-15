client执行输入：
执行prototype构造函数
原始的prototype
复制的prototype[300 400 500]
------------------------------------------------------------------
执行prototype构造函数
原来的sp[3 4 5 com.Mitnick.designmodel.prototype.User@6d4b473]
复制的sp[3 4 5 com.Mitnick.designmodel.prototype.User@6d4b473]
------------------------------------------------------------------
执行prototype构造函数
原来的dp [3 4 5 com.Mitnick.designmodel.prototype.User2@4807ccf6]
复制的dp [3 4 5 com.Mitnick.designmodel.prototype.User2@78214f6b]

原型模式优点：
   1、由于clone方法是由虚拟机直接复制内存块执行，所以在速度上比使用new的方式创建对象要快。
   2、可以基于原型，快速的创建一个对象，而无需知道创建的细节。
   3、可以在运行时动态的获取对象的类型以及状态，从而创建一个对象。
原型模式缺点：
实现深度拷贝比较困难，需要很多额外的代码量。
  
