package chapter04

import scala.util.control.Breaks

object Test06_Break {
  def main(args: Array[String]): Unit = {
    try {
      for (i <- 0 until 5){
        if (i == 3) {
        throw new RuntimeException
        println(i)
        }
      }
    } catch {
      case e: Exception =>  //只是退出循环
    }

    println("循环外的代码")

    //使用Scala中的Breaks类的break方法，实现异常的抛出和捕捉

    Breaks.breakable(
      for (i <- 0 until 5){
        if (i == 3)
          Breaks.break()
      }
    )
  }
}
