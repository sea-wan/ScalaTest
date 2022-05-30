package chapter07

import scala.collection.mutable

/**
 * Author: wanyingfei
 * Date: 2022/4/25 21:10
 * Description:
 * Version: 1.0
 */
object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 2 , "c" -> 3)
    val map2 = mutable.Map("a" -> 6, "b" -> 4 , "d" -> 4, "e" -> 5, "f" -> 6)

    //println(map1 ++ map2)

    val map3 = map1.foldLeft(map2)(
      (mergeMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergeMap(key) = mergeMap.getOrElse(key, 0) + value
        mergeMap
      }
    )

    println(map3)
  }
}
