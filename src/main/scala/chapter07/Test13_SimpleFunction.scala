package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/25 15:39
 * Description:
 * Version: 1.0
 */
object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(5,1,3,5,2,-4,9,10)
    val list2 = List(("a",1),("b",2),("c",3))

    //求和
    val sum = list.reduceLeft(_+_)
    println(sum)

    println(list.sum)

    //求乘积
    println(list.product)

    //求最大值
    println(list.max)

    //求最小值
    println(list.min)

    //排序
    println(list.sorted)

    //排序 从大到小
    //println(list.sortWith( (a: Int, b: Int) => a > b))
    println(list.sortWith(_>_)) //简化写法
    println(list2.sortBy(_._2)(Ordering[Int].reverse))
  }
}
