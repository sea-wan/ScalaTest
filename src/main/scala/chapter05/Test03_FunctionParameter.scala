package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    //可变参数
    def f1(str:String*): Unit ={
      println(str)
    }
    println(f1("ali"))
    println(f1("alis","bob"))

    //如果参数列表中存在多个参数，可变参数一般放在最后

    //参数默认值,一般将有默认值的参数放置在参数列表后面
    def f3(name: String = "guigui"): Unit ={
      println("My name is " + name)
    }
    f3("haha")
    f3()

    //带名参数
    def f4(name: String, age: Int): Unit ={
      println(s"${age}岁的${name}")
    }
    f4("ali",10)
    f4(age = 23, name = "bili")
  }
}
