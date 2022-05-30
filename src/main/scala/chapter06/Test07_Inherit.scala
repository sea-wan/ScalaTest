package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val stu1 = new Student7("ali", 18)
    val stu2 = new Student7("bo", 20, "std001")

    stu1.printInfo()

    val teacher = new Teacher("ali",19)
    teacher.printInfo()

    def personInfo(person: Person7)={
      person.printInfo()
    }

    println("=================")

    //java方法是动态绑定，属性不是动态绑定。 Scala方法是静态绑定，属性是动态绑定。
    val person = new Person7
    personInfo(stu1)
    personInfo(teacher)
  }

}

//定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _

  println("1.父类的主构造器调用")

  def this(name: String, age: Int){
    this()
    println("2.父类的辅助构造器调用")
    this.name = name
    this.age = age

  }

  def printInfo()={
    println(s"Person: $name $age")
  }
}

//定义子类
//父类主构造器无参数,此时调用的是辅助构造器
class Student7(name: String, age: Int) extends Person7 {
  var stdNo: String = _

  println("3.子类的主构造器调用")

  def this(name: String, age: Int, stdNo: String){
    this(name,age) //首先调用主构造器传入 属性
    println("4.子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stdNo")
  }

  
}

class Teacher(name: String, age: Int) extends Person7 {
  override def printInfo(): Unit ={
    println(s"Teacher")
  }
}