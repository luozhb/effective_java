/**
 * 本节讲述使类和成员的可访问性最小化
 * 1.设计良好的模块会隐藏所有的实现细节，把API与它的实现分离开，模块之间通信只通过api进行信息传递
 * 2.信息隐藏的优点：
 * 1）解耦，提高开发效率
 * 2）提高软件的重用性
 * 3）降低构建大型系统的风险
 * 3.访问控制机制
 * 访问控制机制决定了类、接口和成员的可访问性。实体的可访问性是由该实体声明所在的位置，以及该实体声明中所出现的访问修饰符共同决定
 * 4.访问修饰符
 * 1）包级私有（默认的，什么修饰符也没有），同包类可见
 * 2）公有的（public），所有类可见
 * 3）受保护的（protected），只有子类可见
 * 4）私有的（private），自己可见
 * 5.消息隐藏的规则
 * 1）尽可能地使每个类或者成员不被外界所访问
 * 举例子：
 * ㈠对于顶层的类和接口，只有两种访问级别：包级私有和公有
 * ㈡如果一个包级私有的顶层类，只有一个类的内部引用它，可以考虑将它转变为使用它的类的私有嵌套类。如果A是包级私有类，只有B引用了A，可以将A变为B私有内部类后者私有嵌套类
 * 2）子类的成员的访问级别不允许低于超类的访问级别
 * 3）实例域绝不能是公有的。注意：包含公有可变域的类并不是线程安全的
 * 4）类具有公有的静态final数组域，或者返回这种可访问的方法，则是错误的（com.effectivejava.chapter04.item13.demo.ArraysDemo）
 * 总结：尽可能的降低类、接口和方法的可访问性
 * 
 */
package com.effectivejava.chapter04.item15;