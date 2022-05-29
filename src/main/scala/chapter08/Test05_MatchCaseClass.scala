package chapter08

/**
 * Author: wanyingfei
 * Date: 2022/5/3 14:16
 * Description:
 * Version: 1.0
 */
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("wangwu", 20)

    //针对对象实例的内容进行匹配
    val result = student match {
      case Student1("wangwu", 20) => "wangwu, 20"
      case _ => "no"
    }

    println(result)
  }
}

//定义样例类  ,主构造器参数默认是所有属性 ， 伴生对象及apply和unapply方法自动实现
case class Student1(name: String, age: Int)