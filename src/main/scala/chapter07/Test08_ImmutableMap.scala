package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/21 14:58
 * Description:
 * Version: 1.0
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    //创建一个不可变的Map
    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map)
    println(map.getClass)

    //遍历Map
    map.foreach((kv:(String, Int)) => println(kv))
    map.foreach(println)

    println("===========================")

    //访问元素，取map中所有的key或value
    for (key <- map.keys) println(key)
    println(map("a"))

    println("===========================")
    // 4. 访问某一个key的value
    println("a: " + map.get("a").get)
    println("c: " + map.get("c"))
    println("c: " + map.getOrElse("c", 0))

    //不可以修改map
  }
}
