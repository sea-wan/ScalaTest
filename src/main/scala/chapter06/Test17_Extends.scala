package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/18 15:17
 * Description:
 * Version: 1.0
 */
object Test17_Extends {
  def main(args: Array[String]): Unit = {
    //类型的检测和转换
    val student = new Student17("wangwu", 20)
    student.study()
    student.sayHello()
    val person = new Student17("zhangsan", 30)
    person.sayHello()

    println("student is Student17: " + student.isInstanceOf[Student17])
    println("student is Person17: " + student.isInstanceOf[Person17])
    println("person is Person17: " + person.isInstanceOf[Person17])
    println("person is Student17: " + person.isInstanceOf[Student17])

    val person2 = new Person17("lisi", 40)
    println("person2 is Person17: " + person2.isInstanceOf[Student17])

    //类型的转换
    if (person.isInstanceOf[Student17]) {
      val student2 = person.asInstanceOf[Student17]
      student2.study()
      println(student2.name + " " + student2.age)
    }

    println(classOf[Student17])

    //测试枚举类
    println(WorkDay.MONDAY)
    println(WorkDay.TUESDAY)
  }
}

class Person17(val name: String, val age: Int){
  def sayHello(): Unit ={
    println("hello person " + name)
  }
}

class Student17( name: String, age: Int) extends Person17(name, age) {
  override def sayHello(): Unit = {
    println("hi studnet " + name)
  }

  def study(): Unit = {
    println("studying")
  }

}

//定义枚举类对象
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "星期一")
  val TUESDAY = Value(2, "星期二")
}

//定义应用类对象
object TestApp extends App{
  println("app start")

  type MyType = Int
  val a: MyType = 1
  println(a)

}