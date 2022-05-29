package chapter07

import scala.collection.mutable.ListBuffer

/**
 * Author: wanyingfei
 * Date: 2022/4/21 13:57
 * Description:
 * Version: 1.0
 */
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    //创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(12, 23, 34)

    println(list1)
    println(list2)

    println("===========================")

    //添加元素
    list1.append(10,54,23,45)
    list2.prepend(30)

    list1.insert(1,100200)

    println(list1)
    println(list2)

    println("===========================")

    list1 += 100 += 11
    31 +=: list1 += 111
    println(list1)

    println("===========================")
    //合并列表
    val list3 = list1 ++ list2
    println(list1)
    println(list2)
    println(list3)

    list1 ++= list2 //只改变list1的值
    println(list1)
    println(list2)

    println("===========================")
    //修改元素
    list2(0) = 100
    println(list2)

    println("===========================")
    //删除元素
    list2.remove(0)
    println(list2)

    list2 -= 23
    println(list2)
  }
}
