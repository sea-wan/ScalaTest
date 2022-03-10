package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    //变量
    var a = 10
    print(a)

    //类型推断
    var a1 = 10
    val b1 = 11

    //类型确定后，不能修改
    var a2 = 19    //int
    //a2 = 1.0   报错

    //声明变量,必须有初始值


    var ali = new Student("ali", 21)
    ali = new Student("alis", 10)
    ali = null
  }
}
