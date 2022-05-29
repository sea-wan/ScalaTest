package chapter09

/**
 * Author: wanyingfei
 * Date: 2022/5/3 15:57
 * Description:
 * Version: 1.0
 */
object Test03_Generics {
  def main(args: Array[String]): Unit = {
    //协变和逆变
    val child: Parent = new Child
    // val childList: MyCollection[Parent] = new MyCollection[Child]
    val childList: MyCollection[Child] = new MyCollection[Parent]

  }
}

class Parent{}
class Child extends Parent{}
class SubChild extends Child{}

//带泛型的集合类型
class MyCollection[-T]
