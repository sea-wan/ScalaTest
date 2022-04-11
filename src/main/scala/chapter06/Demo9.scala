package chapter06

import scala.collection.mutable.ListBuffer

/**
 * Author: wanyingfei
 * Date: 2022/4/7 16:53
 * Description: ListBuffer 可变 推荐使用方法操作数组, 不可变 推荐符号操作数组
 * Version: 1.0
 */
object Demo9 {
  def main(args: Array[String]): Unit = {
    val lb2 = new ListBuffer[Int]()
    val lb1 = ListBuffer(10,22,22,2,3,4,5)

    lb1.append(111)
    println(lb1)

    lb1.prepend(999)
    println(lb1)

//    12 +: lb1 :+ 78   不适用可变

    12 +=: lb1 += 78
    println(lb1)

    //读取本地文件 打印
//    val file = scala.io.Source.fromFile("/Users/wanyingfei/Downloads/Untitled Export.tsv")
//    for (line <- file.getLines()) {
//      println(line)
//    }

    //wordcount /Users/wanyingfei/Downloads/Untitled Export.tsv
//    val file1 = scala.io.Source.fromFile("/Users/wanyingfei/Downloads/Untitled Export.tsv")
//    val words = file1.mkString.split(" ")
//    val map = scala.collection.mutable.Map[String, Int]()
//    for (word <- words) {
//      val count = map.getOrElse(word, 0)
//      map.put(word, count + 1)
//    }
//    println(map)

    //正则表达式判断是否是数字
    val str = "123"
    val pattern = "[0-9]".r
    val result = pattern.findFirstIn(str)
    println(result)


  }
}
