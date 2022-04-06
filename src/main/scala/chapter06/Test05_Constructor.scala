package chapter06

object Test05__Constructor {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1
    student1.student2()

    val student2 = new Student1("ali")
    val student3 = new Student1("ali", 16)

  }

}

//定义一个类
class Student1 {
  //定义属性
  var name: String = _
  var age : Int = _

  println("1主构造方法被调用")

  //声明辅助构造方法
  def this(name: String){
    this()  //调用主构造器
    println("2调用辅助构造器")
    this.name = name
    println(s"name: ${name} age: ${age}")
  }

  def this(name: String, age: Int){
    this(name)
    println("3调用辅助构造器")
    this.age = age
    println(s"name: ${name} age: ${age}")
  }

  def student2()={
    println("不是构造方法，而是一般方法")
  }
}
