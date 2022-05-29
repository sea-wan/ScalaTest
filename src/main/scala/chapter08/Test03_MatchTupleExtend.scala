package chapter08

/**
 * Author: wanyingfei
 * Date: 2022/4/29 00:14
 * Description:
 * Version: 1.0
 */
object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    //在变量声明时匹配
    val (name, age) = ("wanyingfei", 20)
    println(name + ":" + age)

    println("===========================")
    val List(first, second, _*) = List(1, 2, 3, 4, 5)
    println(first + ":" + second)

    println("===========================")
    val fir :: sec :: rest = List(1, 2, 3, 4, 5)
    println(fir + ":" + sec + ":" + rest)

    println("===========================")
    //for推导式中进行模式匹配
    val list: List[(String, Int)] = List(("wanyingfei", 20), ("wanyingfei", 20))

    //y原本的遍历方式
    for (item <- list) {
      println(item._1 + ":" + item._2)
    }

    println("===========================")
    //将List的元素直接定义为元祖，对变量赋值
    for ((name, age) <- list) {
      println(name + ":" + age)
    }

    println("===========================")
    //可以不考虑某个位置的变量，只遍历key或者value
    for ((name, _) <- list) {
      println(name)
    }

    println("===========================")
    //可以指定某个位置的值
    for (("wanyingfei", count) <- list) {
      println(count)
    }

  }
}
