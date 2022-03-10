package chapter02

import chapter01.Student

object Test07_DataTest {
  def main(args: Array[String]): Unit = {
    //整形


    //字符类型
    val c1 = 'a'


    //布尔类型
    val isTure = true


    //空类型
    //空值Unit
    def m1(): Unit = {
      println("m1调用执行")
    }

    val a = m1()
    println(a)

    //空引用Null
    //val n:Int = null   //值类型不能接收
    var student = new Student("ali" , 21)
    student = null
    println(student)


    //Nothing
    def m2(n:Int):Int = {
      if( n == 0){
        return n
      }else
      throw new NullPointerException
    }

    val b = m2(0)
    println(b)
  }
}
