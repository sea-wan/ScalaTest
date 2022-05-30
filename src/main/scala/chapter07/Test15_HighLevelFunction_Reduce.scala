package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/25 20:45
 * Description:
 * Version: 1.0
 */
object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    //reduce
    println(list.reduce( _ + _))
    println(list.reduceLeft( _ + _))
    println(list.reduceRight( _ + _))

    println("-----------------")

    val list2 = List(3, 5, 7, 9, 11)
    println(list2.reduce( _ - _))
    println(list2.reduceLeft( _ - _))
    println(list2.reduceRight( _ - _))

    println("-----------------")
    //fold
    println(list.fold(10)(_ + _))   //10 + 1 + 2 + 3 + 4 + 5  = 20  初始值 10 加其他值
    println(list.foldLeft(10)(_ - _))  //10 - 1 - 2 - 3 - 4 - 5  = -20 初始值 10 减去其他值
    println(list2.foldRight(10)(_ - _))  //3 - （5 - （7 - （9 - （11 - 10））））  = -2 初始值 10 减去其他值
  }
}
