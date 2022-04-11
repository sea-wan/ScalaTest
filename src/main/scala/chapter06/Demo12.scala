package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/8 13:40
 * Description:
 * Version: 1.0
 */
object Demo12 {
  def main(args: Array[String]): Unit = {
    val tuple2 = ("hello" , 12 , 90.19 , true)

    val tuple = ("hello" , 12 , 90.19 , true) :Tuple4[String,Int,Double,Boolean]
    println(tuple)
    println(tuple2)

    println(tuple._1)

    for (i <- tuple.productIterator)
      println(i)

    //嵌套
    val tuple4 = ("hello" , 12 , 90.19 , true , ( "hi" , "beijing" , 10))
    println(tuple4._5._2)
  }
}
