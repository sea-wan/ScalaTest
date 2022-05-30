package chapter07

import scala.collection.mutable

/**
 * Author: wanyingfei
 * Date: 2022/4/21 14:16
 * Description:
 * Version: 1.0
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    //创建一个可变的Set集合
    val set = mutable.Set(1, 2, 3, 4, 5)
    println(set)

    //添加元素
    set += 6
    println(set)

    //不可变的Set集合，推荐使用方法
    set.add(99)
    println(set)

    //删除元素
    set -= 1
    println(set)

    set.remove(99)
    println(set)

    println("===========================")
    //合并两个Set集合
    val set2 = mutable.Set(6, 7, 8, 9)

    val set4 = set ++ set2
    println(set)
    println(set2)
    println(set4)

    set ++= set2
    println(set)

  }
}
