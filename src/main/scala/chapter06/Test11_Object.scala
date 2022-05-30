package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/18 01:22
 * Description:
 * Version: 1.0
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
    //    val student = new Student11("alice", 18)
    //    student.printInfo()

    val student1 = Student11.newStudent("alice", 18)
    student1.printInfo()

    //apply方法可以直接调用类的构造器,而且可以传入参数,这样就可以实现类的多态
    val student2 = Student11.apply("bob", 19)
    student2.printInfo()

    //apply方法可以省略
    val student3 = Student11("bob", 19)
    student3.printInfo()
  }
}

//定义类 加上标识符标识表示 既是类的主构造器的参数 也是类的属性
//构造方法私有化
class Student11 private(val name: String, val age: Int){
  def printInfo(){
    println(s"student: name = ${name}, age = $age, school = ${Student11.school}")
  }
}

// 伴生对象
object Student11{
  val school: String = "北京大学"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}


