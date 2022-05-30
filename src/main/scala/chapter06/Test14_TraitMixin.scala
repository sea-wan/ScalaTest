package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/18 14:17
 * Description:
 * Version: 1.0
 */
object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student14
    student.study()
    student.increase()

    println("===============================")

    //动态混入
    val studentWithTalet = new Student14 with Talent{
      override def increase(): Unit =
        println("动态混入")

      override def sing(content: String): Unit = println("sing")
    }
  }
}

trait Knowledge {
  var amount = 0
  def increase()

  def study(subject: String): Unit = {
    println("I am studying " + subject)
  }
}

trait Talent {
  var score = 0
  def increase()

  def sing(content: String)

}

class Student14 extends Person13 with Young with Knowledge {
  //重写冲突的属性
  override val name: String = "student"

  //实现抽象方法 override可以省略
  def dating(): Unit ={
    println(s"student $name is dating")
  }

  def study(): Unit ={
    println(s"student $name is study")
  }


  //重写父类的方法
  override def sayHello(): Unit ={
    super.sayHello()
    println(s"hello studnet $name")
  }


}