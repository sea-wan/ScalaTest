package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/18 14:30
 * Description:
 * Version: 1.0
 */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase()


    //钻石问题
    val myfootball = new MyFootball
    println(myfootball.describe())
  }
}

//定义球类特征，钻石问题
trait Ball{
  def describe(): String = "ball"
}

trait ColorBall extends Ball{
  var color: String = "red"
  override def describe(): String = color + "-" + super.describe()
}

//定义种类特征
trait CategoryBall extends Ball {
  val category: String = "foot"
  override def describe(): String = category + "-" + super.describe()
}

//从右到左继承
class MyFootball extends CategoryBall with ColorBall{
  override def describe(): String = "my ball is a " + super.describe()
  //可以指定父类
//  override def describe(): String = "my ball is a " + super[CategoryBall].describe()

}



trait Knowledge15 {
  var amount = 0
  def increase()={
    println("Knowledge increase")
  }

  def study(subject: String): Unit = {
    println("I am studying " + subject)
  }
}

trait Talent15 {
  var score = 0
  def sing()
  def dance()
  def increase()={
    println("Talent increase")
  }

}



//从后往前执行
class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def sing(): Unit = {
    println("Student15 sing")
  }

  override def dance(): Unit = {
    println("Student15 dance")
  }

  override def increase(): Unit = {
    super.increase()
  }
}