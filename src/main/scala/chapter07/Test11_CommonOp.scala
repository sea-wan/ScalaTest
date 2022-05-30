package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/21 15:40
 * Description:
 * Version: 1.0
 */
object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val set = Set(1, 2, 3, 4, 5)

    //获取集合长度
    println(list.length)

    //获取集合大小
    println(set.size)

    //循环遍历集合
    for(item <- list){
      println(item)
    }

    set.foreach(println)

    //迭代器
    for(elem <- list.iterator){
      println(elem)
    }

    //生成字符串
    println(list)
    println(set)
    println(list.mkString("-"))

    //判断是否包含某个元素
    println(list.contains(3))
  }
}
