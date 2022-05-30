package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/25 21:31
 * Description:
 * Version: 1.0
 */
object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList = List(
      ("Hello Scala Spark World", 1),
      ("Hello Scala Spark", 1),
      ("Hello Scala" , 1),
      ("Hello", 1),
      ("Hello Spark World", 1),
      ("Hello Kafka", 1),
      ("Hello Yarn", 1),
      ("Hello Flink", 1),
      ("Hello Hadoop", 1)
    )

    //思路1 直接展开为普通版本
    val newString = tupleList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )

    println(newString)

    val wordCount = newString
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)
    println(wordCount)

    println("---------------------------------")

    //思路2 直接基于预统计的结果进行转换
    //将字符串打散为单词，并统计单词出现的次数
    val preCountList = tupleList.flatMap(
      tuple => {
        val strings =tuple._1.split(" ")
        strings.map(word => (word, tuple._2))
      }
    )
    println(preCountList)

    //对二元组按照单词进行分组
    val preCountMap = preCountList.groupBy(_._1)
    println(preCountMap)

    //叠加每个单词预统计的个数值  mapValues已被弃用
    val countMap: Map[String,Int] = preCountMap.transform(
      (k,v) => v.foldLeft(0)(_ + _._2)
    )
    println(countMap)

    //转换成List，排序取前三
    val countList = countMap.toList.sortBy(_._2)(Ordering.Int.reverse).take(3)
    println(countList)

  }
}
