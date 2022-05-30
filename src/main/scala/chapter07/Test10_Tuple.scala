package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/21 15:30
 * Description:
 * Version: 1.0
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // 元组
    val tuple = ("zhangsan", 20, '男', "beijing",true)
    println(tuple)

    // 访问元组
    println(tuple._1)

    println(tuple.productElement(0)) //通过下标访问元组元素

    println("===========================")
    // 元组遍历
    for (elem <- tuple.productIterator) println(elem)

    //嵌套元组
    val tuple2 = ("zhangsan", 20, '男', "beijing",true,(100,200))
    println(tuple2._6._1)
  }
}
