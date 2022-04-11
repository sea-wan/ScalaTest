package chapter03

import scala.language.postfixOps

object Test01_TestOperater {
  def main(args: Array[String]): Unit = {
    //算数运算符
    val result1 = 10 / 3
    println(result1)

    val result2 : Double = 10 / 3
    println(result2)

    val result3 : Double = 10.0001 / 3
    println(result3.formatted("%.3f"))

    val result4 = 10 % 3
    println(result4)

    val s1 : String = "hello"
    val s2 : String = new String("hello")
    println(s1 == s2)
    println(s1.eq(s2))  //判断地址值

    def isNotEmpty(str : String):Boolean = {
      return str  != null && !("".equals(str.trim))
    }

    println(isNotEmpty(null))

    println(7.6 toInt)

  }
}
