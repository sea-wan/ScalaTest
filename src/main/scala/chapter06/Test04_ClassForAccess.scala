package chapter06

object Test04_ClassForAccess {

}

//定义一个父类
class Person {
  private var idCard: String = "32492983748971"
  protected var name: String = "ali"
  var sex: String = "female"
  private[chapter06] var age: Int = 18             //包访问权限

  def printInfo()={
    println(s"Person: ${idCard} ${name} ${sex} ${age}")
  }
}
