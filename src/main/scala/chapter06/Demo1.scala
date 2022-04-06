package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/1 14:36
 * Description:
 * Version: 1.0
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val ali = new PersonDemo("ali", 18)
    ali.say()
    println(s"${ali.name} + ${ali.age}")
  }
}

class PersonDemo(var name: String,var age: Int){
  def say(): Unit ={
    println(s"hello $name I'm $age")
  }
}