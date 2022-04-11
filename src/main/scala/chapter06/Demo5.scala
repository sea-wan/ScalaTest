package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/6 14:04
 * Description: Array
 * Version: 1.0
 */
object Demo5 {
  def main(args: Array[String]): Unit = {
    val arr2 = new Array[Int](10)
    val arr = Array(5,11,43,15,24)
    println(arr)

    //访问元素
    arr(0) = 10
    println(arr(0))

    println("遍历数组")

    println("for循环遍历")
    //普通for循环遍历
    for ( i <- 0 until arr.length )
      println(arr(i))

    for ( i <- arr.indices) println(arr(i))


    println("直接遍历元素，增强for循环")
    //直接遍历元素，增强for循环
    for(elem <- arr) println(elem)

    println("-----迭代器-----")
    val iterator = arr.iterator
    while (iterator.hasNext){
      println(iterator.next())
    }

    println("调用foreach")
    arr.foreach(elem => println(elem))

    arr.foreach(println)

    println(arr.mkString("-"))


    //添加元素
    val ints = arr.:+(69)
    println(arr.mkString("-"))
    println(ints.mkString("-"))

    val ints1 = ints.:+(90)
    println(ints1.mkString("-"))

    val ints2 = ints1 :+ 100
    val ints3 = 100 +: ints2 :+ 1001
    println(ints2.mkString("-"))
    println(ints3.mkString(","))
  }
}
