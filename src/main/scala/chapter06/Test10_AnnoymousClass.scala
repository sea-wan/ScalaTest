package chapter06

object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    //匿名子类
    val person =new Person10 {
      override var name: String = "ali"

      override def eat(): Unit =println("person eat")
    }

    println(person.name)
    person.eat()

  }
}

//定义抽象类
abstract class Person10{
  var name: String
  def eat()

}
