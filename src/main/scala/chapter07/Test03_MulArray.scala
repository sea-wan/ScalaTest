package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/20 14:51
 * Description:
 * Version: 1.0
 */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    //创建一个二维数组
    val arr = Array.ofDim[Int](3, 4)

    //访问元素
    arr(1)(2) = 10
    arr(2)(3) = 20
    println(arr(1)(2))

    println("===========================")
    //遍历
    for(i <- 0 until arr.length; j <- 0 until arr(i).length) {
      print(arr(i)(j) + "\t")
      if(j == arr(i).length - 1) {
        println()
      }
    }

    println("===========================")
    //遍历foreach
    arr.foreach(line => line.foreach(println))
    arr.foreach(_.foreach(println))
  }
}
