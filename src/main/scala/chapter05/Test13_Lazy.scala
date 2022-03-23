package chapter05

object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(12,18)   //可以理解为传名参数,有些不同
                                        //第一次调用时才加载函数
    println("1.函数调用")
    println("2.result = " + result)
    println("4.result = " + result)
  }

  def sum(a: Int, b: Int): Int={
    println("3.调用")
    a + b
  }
}
