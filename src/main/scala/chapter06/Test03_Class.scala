package chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    //创建一个对象
    val student = new Student
//    student.name    //name 是 private属性
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)
  }
}

//定义一个类
class Student {
  //定义属性
  private var name = "ali"
  @BeanProperty     //java bean规范  getter  setter
  var age: Int = _    //默认 0
  var sex: String = _   //默认 null
}
