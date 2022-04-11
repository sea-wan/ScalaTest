package chapter06

import scala.collection.mutable

/**
 * Author: wanyingfei
 * Date: 2022/4/8 10:12
 * Description: Set集合
 * Version: 1.0
 */
object Demo10 {
  def main(args: Array[String]): Unit = {
    //不可变
    val set1 = Set(13, 23, 53, 12, 13, 23, 78)

    val set2 = set1 + 1
    println(set2)

    val set3 = set2 - 12
    println(set3)

    println("==================")

    //可变
    val set11 = mutable.Set(13, 23, 53, 12, 13, 23, 78)
    println(set11)

    val set12 = set11.add(1)
    println(set11)

    set11.remove(13)
    println(set11)
  }
}
