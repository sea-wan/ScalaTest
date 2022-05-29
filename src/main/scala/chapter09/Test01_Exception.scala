package chapter09

/**
 * Author: wanyingfei
 * Date: 2022/5/3 14:52
 * Description:
 * Version: 1.0
 */
object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try{
      val n = 10 / 1
    } catch {
      case e: ArithmeticException =>
        println("发生算数异常")

      case e: Exception =>
        println("发生异常")

    } finally {
      println("无论如何都会执行")
    }
  }
}
