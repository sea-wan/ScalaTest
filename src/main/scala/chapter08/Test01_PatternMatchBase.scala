package chapter08

/**
 * Author: wanyingfei
 * Date: 2022/4/26 15:10
 * Description:
 * Version: 1.0
 */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    //定义基本语法
    val x: Int = 2
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }
    println(y)

    //用模式匹配实现简单二元运算
    val a = 25
    val b = 13

    def matchDualOp(op: Char) = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "Invalid operator"
    }
    println(matchDualOp('+'))


    //模式守卫
    //求一个整数的绝对值
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(67))
    println(abs(-2))

  }
}
