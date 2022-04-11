package chapter06

import scala.collection.mutable

/**
 * Author: wanyingfei
 * Date: 2022/4/8 10:56
 * Description: Map
 * Version: 1.0
 */
object Demo11 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)

    println("=========================")

    map1.foreach(println)
    map1.foreach((kv: (String,Int) ) => println(kv))

    map1

    for (key <- map1.keys){
      println(s"$key ---> ${map1.get(key)}")
    }

    println(map1.get("a").get)
    println(map1.get("c"))
    println(map1.getOrElse("c",0))


    println("==================可变")

    val map2 = mutable.Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map2)
    println(map2.getClass)

    map2.put("c",10)
    println(map2)
    map2 += (("d",11))
    println(map2)

    map2.remove("hello")
    println(map2)

    val map3: Map[String, Int] = Map("aaa" -> 11, "b" -> 29, "hello" -> 5)
    val map4 = map2 ++ map3
    println(map2)
    println(map3)
    println(map4)
  }
}
