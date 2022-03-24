package chapter05

object Test04_Simplify {
  def main(args: Array[String]): Unit = {
    def f0(name: String): String={
      return name
    }
    println(f0("hello"))

    println("=============华丽的分割线============")

    //retrun可以省略,Scala会使用函数体最后一行代码作为返回值
    def f1(name: String): String={
       name
    }
    println(f0("hello"))

    println("=============华丽的分割线============")

    //如果函数体中只有一行代码,可以省略花括号
    def f2(name: String): String = name
    println(f2("hello"))

    println("=============华丽的分割线============")

    //如果返回值类型能够推断出来，可省略
    def f3(name: String) = name
    println(f3("hello"))

    println("=============华丽的分割线============")

    //如果有return,则不能省略返回值类型,必须指定
//    def f4(name: String)={
//      return name
//    }
//    println(f4("hi"))

    println("=============华丽的分割线============unit")

    //如果函数明确声明unit,那么即使函数体中使用return关键字也不起作用
    def f5(name: String): Unit ={
      return name
    }
    println(f5("sil"))

    println("=============华丽的分割线============")

    def f6(name: String){
      println(name)
    }
    println(f5("cil"))

    println("=============华丽的分割线============")

    //如果函数无参,但是声明了参数列表,那么调用时,小括号,可加可不加
    def f7(): Unit ={
      println("hello")
    }
    f7()
    f7

    println("=============华丽的分割线============")

    //如果函数没有参数列表,那么小括号可以省略,调用时小括号必须省略
    def f8: Unit ={
      println("hah")
    }
    f8

    println("=============华丽的分割线============")

    //如果不关心名称,只关心处理逻辑,那么函数名和def可以省略
    (name: String) =>{ println("hello")}  //匿名函数,lambda表达式
  }
}
