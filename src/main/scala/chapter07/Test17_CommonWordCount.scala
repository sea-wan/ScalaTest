package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/25 21:20
 * Description:
 * Version: 1.0
 */
object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List(
      "Hello Scala Spark World",
      "Hello Scala Spark",
      "Hello Scala",
      "Hello",
      "Hello Spark World",
      "Hello Kafka",
      "Hello Yarn",
      "Hello Flink",
      "Hello Hadoop"
    )

    //对字符串进行切分，得到一个打散的单词列表
    val wordList1 = stringList.flatMap(_.split(" "))
    println(wordList1)

    //对单词进行分组
    val wordList2 = wordList1.groupBy(word => word)
    println(wordList2)

    //对单词进行计数
    val countMap = wordList2.map(kv => (kv._1, kv._2.length))
    println(countMap)

    //对计数结果进行排序
    val sortList = countMap.toList.sortWith( (left, right) => left._2 > right._2).take(3)
    println(sortList)
  }
}
