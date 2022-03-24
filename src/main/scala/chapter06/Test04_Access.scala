package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person = new Person
    person.printInfo()

    val worker = new Worker
    worker.printInfo()
  }
}

//定义一个子类
class Worker extends Person {
  override def printInfo(): Unit = {
    println("Worker:")
//    println(idCard) //私有，无法访问
    name = "bis"
    age = 34
    sex = "male"
    println(s"Person: ${name} ${sex} ${age}")
  }
}
