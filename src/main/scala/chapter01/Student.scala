package chapter01

class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 引入伴生对象
object Student {
  val school = "atgui"

  def main(args: Array[String]): Unit = {
    val al = new Student("al", 22)
    val hi = new Student("hi", 21)
    al.printInfo()
    hi.printInfo()
  }
}
