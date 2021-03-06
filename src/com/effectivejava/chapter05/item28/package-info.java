/**
 * 本节学习列表优于数组
 * 1.数组和泛型的区别
 * 1）数组是协变的，sub是super的子类型，则数组sub[]就是Super[]的子类型，而
 * 泛型是可变的，对于任意两个不同的类型Type1和Type2，List<Type1>既不是List<Type2>的子类，也不是List<Type2>的超类
 * 2）数组是具体化的，数组在运行时强化它的类型，而泛型则编译期强化它的类型，在运行期则擦除元素类型信息
 * 注：擦除就是使泛型可以与没有使用泛型的代码随意进行互用，以确保java5平台平滑过渡到泛型
 * 2.不可具体的类型与唯一可具体化的参数化类型
 * 不可具体的类型是指运行是表示法包含的信息比它的编译时表示法包含的信息更少的类型
 * 唯一可具体化参数化类型是无限制的通配符类型，如List<?>和Map<?,?>，创建无限制通配符类型的数组是合法的（Demo1中有例子）
 * 3.结合使用可变参数方法和泛型会出现令人费解的警告，可变参数其实是一个数组，当这个数组的元素不可具体化则出现告警，利用SafeVarares注解解决这个告警
 * 总结：
 * 数组是协变且可以具体化的；泛型是不可变的且可以被擦除的。
 * 数组提供运行期的类型安全，没有编译期的类型安全，泛型则相反
 * 
 */
package com.effectivejava.chapter05.item28;