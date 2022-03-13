package chapter05

object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    //无参，无返回值
    def f1()={
      println("1.无参,无返回值")
    }
    println(f1())


    //无参，有返回值
    def f2():Int ={
      println("2.无参,有返回值")
      return 12
    }
    println(f2())

    //有参，无返回值
    def f3(name : String): Unit ={
      println("3.有参,无返回值"+name)
    }
    println(f3("ali"))

    //有参，有返回值
    def f4(name : String): String={
      println("4.有参,有返回值"+name)
      return name
    }
    println(f4("alis"))

    //多参，无返回值
    def f5(name1: String,name2: String): Unit ={
      println("5.多参,无返回值")
      println(s"${name1}和${name2}")
    }
    println(f5("ali","bob"))

    //多参，有返回值
    def f6(a: Int,b: Int):Int ={
      println("6.多参,无返回值")
      return a + b
    }
    println(f6(1,2))
  }
}
