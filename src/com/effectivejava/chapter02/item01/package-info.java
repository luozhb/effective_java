/**
 * 使用静态方法代替构造器创建对象  例子在demo包中，可以查看
 * 优点：
 * 1.每一个静态工厂方法都有名称，可以通过名称有很好的区分，易于理解，而构造器不能确切的描述返回对象
 * 2.不必在每次调用（构造器）时都创建一个新的实例。实例受控的类可以控制什么时候创建对象，确保对象是单例的（Singleton）或者不可实例的对象（构造器是private的）
 * 3.静态工厂方法可以返回原返回类型的任何子类型的对象，在java中这种方式叫协变返回。即返回类型是父类型，生成对象可以是任何继承或者实现该类型的子类型。
 * 4.静态工厂方法创建参数化类型实例的时候，它们使得代码变得更加简洁。例如CreateReferenceObject的方法
 * 缺点：
 * 1.类如果不含有公有的或者受保护的构造器，就不能被子类化，即private的构造器不能被继承
 * 2.静态工厂方法与其他静态方法实际上没有任何区别，可以使用命名来加以区分获取的对象的方式和类型，如getInstance和newInstance
 */
package com.effectivejava.chapter02.item01;