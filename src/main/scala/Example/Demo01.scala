package Example

/**
 * Author: wanyingfei
 * Date: 2022/4/8 13:52
 * Description:
 * Version: 1.0
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5)
    val set1 = Set(1,2,3,4,5,8)

    println(list1.length)
    println(list1.size)
    println(set1.size)

    for (i <- list1)
      println(i)

    set1.foreach(println)

    for (j <- list1.iterator)
      println(j)

    println(list1)
    println(set1)
    println(list1.mkString("--"))

    println(list1.contains(2))
    println(set1.contains(100))
  }
}
