package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/6 11:43
 * Description:
 * Version: 1.0
 */
object Demo3 {
  def main(args: Array[String]): Unit = {
    val men = new Men
    men.stupidMen()
    men.sayHello()
    men.increase()
    men.holy()
  }
}


class Father{
  val name: String = "god"
  var age: Int = 1000000
  def sayHello(): Unit = {
  println("hello from: " + name)
  }
  def increase(): Unit = {
  println("god increase")
  }
}

trait Old{
  val name: String = "Jesus"
  var age: Int
  def holy(): Unit ={
    println(s"Holy $name Father")
  }

  def stupidMen(): Unit
}

class Men extends Father with Old {
  override val name: String = "Jesus"

  override def stupidMen(): Unit = println(s"$name is stupid")
}