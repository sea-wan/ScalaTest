package chapter04

import scala.io.StdIn

object Test01_IfElese {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄:")
    val age = StdIn.readInt()

    //单分支
    if (age >= 18) println("成年")

    println("=========")

    //双分支
    if (age >= 18)
      println("成年")
    else
      println("未成年")

    println("==========")

    //多分支
    val result = if (age <= 6)
      println("童年")
    else if (age < 18)
      println("青少年")
    else if (age < 35)
      println("青年")
    else if (age < 60)
      println("中年")
    else
      println("老年")

    println("=========")

    //分支语句返回值
    println("result:" + result)


    //java三元运算符 a?b:c

  }
}
