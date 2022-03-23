package chapter05

object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int={
      a + b
    }

    //考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    //扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    //将固定加数作为另一个参数传入，但是作为 第一层参数 传入
    def addByFour1(): Int=>Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    def addByA(a: Int): Int=>Int = { //另一种写法  , 闭包 ： 通用性、适用性
      def addB(b: Int): Int ={
        a + b
      }
      addB
    }

    println(addByA(34)(56))

    val addByFour2 = addByA(4)
    println(addByFour2(6))


    //lambda表达式简写
    def addByA1(a: Int): Int=>Int = {
     (b: Int) =>{
        a + b
      }
    }

    def addByA2(a: Int): Int=>Int = {
      b => a + b
    }

    def addByA3(a: Int): Int=>Int = {  //如果参数只出现一次，可使用通配符
       a + _
    }

    def addByA4(a: Int): Int=>Int = a + _
  }
}
