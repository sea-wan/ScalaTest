package chapter08

/**
 * Author: wanyingfei
 * Date: 2022/5/3 14:34
 * Description:
 * Version: 1.0
 */
object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(("wanyingfei", 20), ("wanyingfei", 20))

    //map转换，实现key不变，value变化
    val newList = list.map (
      tuple => (tuple._1, tuple._2 + 1)
    )
    println(newList)

    //用模式匹配对元组元素赋值，实现功能
    val newList2 = list.map(
      tuple => {
        tuple match {
          case (word, count) => (word, count + 1)
        }
      }
    )
    println(newList2)

    //省略lambda表达式的写法，实现功能
    val newList3 = list.map {
      case (word, count) => (word, count + 1)
    }
    println(newList3)



    // 偏函数的应用，求绝对值
    // 对输入数据分为不同的情形：正、负、0
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

    println(abs(-67))
    println(abs(35))
    println(abs(0))
  }
}
