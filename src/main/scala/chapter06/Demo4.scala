package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/6 13:21
 * Description: 钻石问题
 * Version: 1.0
 */
object Demo4 {
  def main(args: Array[String]): Unit = {
    val ball = new MyBall
    println(ball.describe())
  }
}

trait Ball{
  def describe() ="ball"
}

trait ColorBall extends Ball {
  var color = "blue"
  override def describe(): String = color + "-" + super.describe()
}

trait CategoryBall extends Ball {
  var category = "basket"
  override def describe(): String = category + "-" + super.describe()
}

class MyBall extends CategoryBall with ColorBall{
  override def describe(): String = super.describe()
}
