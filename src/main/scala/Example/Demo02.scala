package Example

/**
 * Author: wanyingfei
 * Date: 2022/4/8 14:14
 * Description:
 * Version: 1.0
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,3,2,5,6,7,4,10)
    val list2 = List(10,3,5,2,99,8)

    println(list1.head)
    println(list1.tail)   //除头部以外都算是尾
    println(list1.last)
    println(list1.init)   //初始值，除尾

    println(list1.reverse)

    println(list1.take(3))
    println(list1.takeRight(2))

    val value = list1.union(list2)
    println(value)
    println(list1 ::: list2)

    //set并集会做去重
    val set1 = Set(1,3,5,7,2,89)
    val set2 = Set(3,7,2,45,4,8,19)

    val union2 = set1.union(set2)
    println("union2: " + union2)
    println(set1 ++ set2)

    //交集
    val value2 = list1.intersect(list2)
    println(value2)

    //差集
    val value3 = list1.diff(list2)
    println(value3)

    //拉链
    println(list1.zip(list2))
    println(list2.zip(list1))

    //划动
//    for ( i <- list1.sliding(3)){
//      println(i)
//    }

    println("=====================")

//    for ( i <- list1.sliding(3,2))   //间隔
//      println(i)
//
//
//    for ( i <- list1.sliding(4,5))
//      println(i)

    println(list1.sum)
  }
}
