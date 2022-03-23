package chapter05

object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    //传值参数
    def f0(a: Int)={
      println("a:"+a)
      println("a:"+a)     //打印多次，依旧用传递的值
    }
    f0(23)

    def f1(): Int = {
      println("f1diaoyong")
      12
    }
    f0(f1())

    println("==================")

    //传名参数,传递的是代码块
    def f2(a: => Int) = {
      println("a:"+a)
      println("a:"+a)
    }
    f2(33)
    f2(f1())   //代码块赋给a , 控制抽象
    f2({
      println("代码块")
      90
    })
  }
}
