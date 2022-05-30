package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/25 20:22
 * Description:
 * Version: 1.0
 */
object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //过滤
    //选取偶数
    val evenList = list.filter( (elem: Int) => elem % 2 == 0)
    println(evenList)
    println(list.filter( _ % 2 == 0)) //简写

    println("---------------------")

    //map 映射
    //把集合中每个数乘2
    println(list.map( _*2))
    println(list.map( x => x*x)) //平方

    //扁平化 flatten
    val nestedList = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))

    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)

    val flatList2 = nestedList.flatten
    println(flatList2)

    //扁平映射
    //将一组字符串分词，并保存成单词的列表
    val strings = List("hello world", "hello scala" , "hello spark" , "hello hadoop" , "hello akka" , "hello spark streaming")
    val splitList = strings.map( _.split(" ")) //把每个字符串分词
    println(splitList)
    val flattenList = splitList.flatten //扁平化
    println(flattenList)

    val flatmapList = strings.flatMap( _.split(" ")) //
    println(flatmapList)

    println("---------------------")

    //分组 groupBy
    //分成奇偶两组
    val groupMap = list.groupBy( _ % 2)
    val groupMap2 = list.groupBy( data => if (data % 2 == 0) "偶数" else "奇数")
    println(groupMap)
    println(groupMap2)

    //给定一组词汇，按照单词的首字母分组
    val wordsList = List("china", "america", "japan", "korea", "america", "japan", "korea", "china", "america", "japan", "korea")
    val groupMap3 = wordsList.groupBy( _.charAt(0))
    println(groupMap3)
  }
}
