package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    val fun =(name: String) =>{ println(name)}  //匿名函数,lambda表达式
    fun("hello")



    //定义一个函数,以函数作为参数输入
    def f(func: String => Unit): Unit ={
      func("guigui")
    }

    f(fun)
    f ((name: String) =>{ println(name)})


    //匿名函数简化原则
    //参数类型可以省略，会根据形参进行推导
    f ((name) =>{ println(name)})

    //类型省略之后，只有一个参数，圆括号可以省略；其他情况：没有参数和参数超过1的不能省略圆括号
    f (name =>{ println(name)})

    //匿名函数如果只有一行，大括号可以省略
    f (name => println(name) )

    //如果参数只出现一次,则残念书省略且后面参数可以用_代替
    f ( println(_) )

    //如果可以推断出，当前传入的println是一个函数体,而不是调用语句,可以直接省略下划线
    f (println)



    //实际实例,定义一个“二元运算”函数,之操作1和2两个数,但是具体运算通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int)=>Int): Int={
      fun(1,2)
    }

    val add = (a: Int, b:Int) => a+b
    val minus = (a: Int, b:Int) => a-b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))
  }
}
