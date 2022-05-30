package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/18 14:05
 * Description:
 * Version: 1.0
 */
object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()
    student.play()
    student.study()

  }
}

//定义一个父类
class Person13{
  val name: String = "person"
  var age: Int = 19
  def sayHello(): Unit ={
    println("hello "+name)
  }

  def increase()={
    println("Person increase")
  }
}

//定义一个特质
trait Young{
  //声明抽象和非抽象属性
  var age: Int
  val name: String = "young"

  //声明抽象和非抽象方法
  def play() = println("play")

  //声明抽象方法
  def dating()

}

class Student13 extends Person13 with Young{
  //重写冲突的属性
  override val name: String = "student"

  //实现抽象方法
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