package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    def fun(): Int = {
      println("fundiaoyong")
      1
    }

    fun

    val result = f(123)
    println(result)

    //1.函数作为值进行传递
    val f1: Int => Int = f
    val f2 = f _  //另一种写法

    println(f1(12))
    println(f2(15))

    println("===========================")

    val f3: ()=> Int = fun    //调用上一个 fun  第15行
    val f4 = fun _  //完整函数体
    println(f3())
    println(f4())

    //2.函数作为参数进行传递
    println("函数作为参数进行传递")
    //定义一个二元计算函数
    def dualEval(op: (Int,Int)=>Int,a: Int, b: Int): Int={
      op(a,b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add,34,56))
    println(dualEval((a,b)=> a + b , 34 , 56))
    println(dualEval(_ + _ , 34 , 56))


    //3.函数作为函数的返回值返回
    println("函数作为函数的返回值返回")
    def f5(): Int => Unit= {
      def f6(a: Int)={
        println("f6调用" + a)
      }
      f6
    }

    println(f5())
    val f6 = f5()
    println(f6)
    println(f6(25))

    println(f5()(254))  //调用f6
  }
}
