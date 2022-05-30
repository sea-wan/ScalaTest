package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/21 15:46
 * Description:
 * Version: 1.0
 */
object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    //创建一个集合
    val list = List(1, 2, 3, 4, 5)
    val list2 = List(6, 7, 8, 9, 10,5,4,3)

    //获取集合的头
    println(list.head)

    //获取集合的尾
    println(list.tail) //不是头部的元素

    //获取集合最后一个元素
    println(list.last)

    //获取集合初始的元素
    println(list.init) //不包含最后一个元素

    //反转
    println(list.reverse)

    //取出集合的前n个元素
    println(list.take(3))
    println(list.takeRight(3))

    //取出集合的后n个元素
    println(list.drop(3))
    println(list.dropRight(3))

    //并集
    println(list.union(list2))
    println(list ::: list2)

    //set集合，去重
    val set = Set(1,2,3,4,5)
    val set2 = Set(3,4,5,6,7,8,9,10)
    println(set.union(set2))
    println(set ++ set2)

    //交集,取出两个集合中相同的元素
    val itersection = list.intersect(list2)
    println(itersection)

    //差集，取出两个集合中不同的元素
    val diff = list.diff(list2)
    val diff2 = list2.diff(list)
    println(diff)
    println(diff2)

    //拉链
    println(list.zip(list2))
    println(list2.zip(list))

    //滑窗
    println(list.sliding(3).toList)
    for(elem <- list.sliding(3)){
      println(elem)
    }

    println("===========================")

    for (elem <- list2.sliding(3,3)){
      println(elem)
    }

  }
}
