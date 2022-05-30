package chapter07

import scala.collection.mutable

/**
 * Author: wanyingfei
 * Date: 2022/4/21 15:16
 * Description:
 * Version: 1.0
 */
object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    //创建一个可变的Map
    val map = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map)
    println(map.getClass)

    println("===========================")
    //添加元素
    map.put("d", 4)
    println(map)

    map += ("e" -> 5)
    map += (("f", 6))
    println(map)

    println("===========================")
    //删除元素
    map.remove("a")
    println(map)
    println(map.getOrElse("a", 0))

    map -= "b"
    println(map)

    println("===========================")

    //修改元素
    map("c") = 7
    println(map)

    map.update("c", 8)
    map.update("g", 9) //如果key不存在，则添加
    println(map)

    println("===========================")
    //合并两个map
    val map2 = mutable.Map("g" -> 9, "h" -> 10)
    map ++= map2
    println(map)
    println(map2)

    println("===========================")

  }
}
