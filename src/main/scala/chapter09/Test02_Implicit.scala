package chapter09

/**
 * Author: wanyingfei
 * Date: 2022/5/3 15:30
 * Description:
 * Version: 1.0
 */
object Test02_Implicit {
  def main(args: Array[String]): Unit = {
    val new12 = new MyRichInt(12)
    println(new12.myMax(23))

    //隐式函数
    implicit def int2MyRichInt(i: Int): MyRichInt = new MyRichInt(i)

    println(12.myMax(23))

    //隐式类
    implicit class MyRichInt2(val self: Int) {
      //自定义比较大小的方法
      def myMax2(x: Int): Int = {
        if(self > x) self else x
      }

      def myMin2(x: Int): Int = {
        if(self < x) self else x
      }
    }
    println(12.myMin2(23))

    //隐式参数
    implicit val str: String = "alex"
    implicit val age: Int = 18

    def sayHello()(implicit name: String): Unit ={
      println(s"hello $name")
    }

    def sayHi(implicit name: String = "wan"): Unit ={
      println(s"hi $name")
    }

    sayHello()
    sayHi()

    //简便写法
    def hiAge(): Unit ={
      println(s"hi "+ implicitly[Int])
    }
    hiAge()
  }
}

//定义类
class MyRichInt(val self: Int) {
  //自定义比较大小的方法
  def myMax(x: Int): Int = {
    if(self > x) self else x
  }

  def myMin(x: Int): Int = {
    if(self < x) self else x
  }
}
