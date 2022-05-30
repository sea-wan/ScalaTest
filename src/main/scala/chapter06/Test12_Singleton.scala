package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/18 13:49
 * Description:
 * Version: 1.0
 */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    println(student1)
    student1.printInfo()

  }
}

class Student12 private(val name: String, val age: Int){
  def printInfo(){
    println(s"student: name = ${name}, age = $age, school = ${Student11.school}")
  }
}

//饿汉式 单例设计模式
//object Student12{
//  // 单例对象
//  private val student: Student12 = new Student12("wanyingfei", 22)
//  def getInstance(): Student12 = student
//}

//懒汉式 单例设计模式
object Student12{
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if(student == null){
      student = new Student12("wanyingfei", 22)
    }
    student
  }
}