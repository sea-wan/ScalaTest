package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    //定义函数
    def sayHi(name: String): Unit = { //函数
      println("hi,"+name)
    }

    sayHi("ali")

    Test01_FunctionAndMethod.sayHi("bob") //调用对象的方法
  }

  def sayHi(name:String)={ //方法
    println("hello,"+name)
  }
}
