package chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    //控制台输入
    println("请输入姓名:")
    val name: String = StdIn.readLine()
    println("请输入年龄:")
    val age: Int = StdIn.readInt()

    println(s"姓名:${name},年龄:${age}")

  }

}
