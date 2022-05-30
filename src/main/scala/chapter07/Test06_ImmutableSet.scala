package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/21 14:09
 * Description:
 * Version: 1.0
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    //创建一个不可变的Set
    val set = Set(1, 2, 3, 4, 5,4,3,2,1)  //数据无序，不可重复
    println(set)

    println("===========================")
    //添加元素
    val set2 = set + 6  //无序
    println(set2)

    println("===========================")
    //合并两个Set
    val set3 = Set(43, 44, 45)
    val set4 = set ++ set3
    println(set4)

    println("===========================")
    //删除元素
    val set5 = set4 - 3
    println(set5)
  }
}
