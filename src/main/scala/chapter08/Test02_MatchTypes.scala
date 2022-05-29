package chapter08

/**
 * Author: wanyingfei
 * Date: 2022/4/28 23:39
 * Description:
 * Version: 1.0
 */
object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    //匹配常量
    def describeConst(x: Any): String = x match {
      case 1 => "Int One"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "Unknown"
    }

    println(describeConst(1))
    println(describeConst(0.9))
    println(describeConst("hello"))
    println(describeConst(true))
    println(describeConst('+'))

    println("===========================")
    //匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int"
      case s: String => "String"
      case b: Boolean => "Boolean"
      case c: Char => "Char"
      case list: List[_] => "List"
      case list: List[Int] => "List[Int]"
      case array: Array[Int] => "Array[Int]"
      case _ => "Unknown"
    }

    println(describeType(1))
    println(describeType("hello"))
    println(describeType(true))
    println(describeType('+'))
    println(describeType(List(1, 2, 3)))   //list 存在泛型擦除
    println(describeType(Array("we", 2, 3)))   //array 不存在泛型擦除

    println("===========================")
    //匹配数组
    for( arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("hello"),
      Array("hello", "world"),
      Array(1.1, 2.2, 3.3),
      Array("hello", 2, 3, 4, 5)
    )){
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1, 0)"
        case Array(x, y) => "Array(" + x + ", " + y + ")"  //匹配两个元素
        case Array(0, _*) => "0 ..." //匹配以0开头的数组
        case Array(x, 1, z) => "Array( 中间为一的素组 )"
        case _ => "Unknown"
      }
      println(result)
    }

    println("===========================")
    //匹配列表
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 1, 0),
      List(1, 1, 0),
      List(1, 1, 0, 1),
      List("hello"),
      List("hello", "world"),
      List(1.1, 2.2, 3.3),
      List("hello", 2, 3, 4, 5)
    )) {
      val result = list match {
        case List(0) => "0"
        case List(x, y) => "List(" + x + ", " + y + ")"  //匹配两个元素
        case List(0, _*) => "0 ..." //匹配以0开头的数组
        case List(a) => "List(a)" + a
        case _ => "Unknown"
      }
      println(result)
    }

    //方式二
    println("===========================")
    val list1 = List(1, 2, 3)
    val list2 = List(88, 99)
    list1 match {
      case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
      case _ => println("Unknown")
    }

    println("===========================")
    //匹配元组
    for (tuple <- List(
      (0, 1, 2),
      (1, 0, 2),
      (1, 2, 3),
      (1, 2, 3, 4),
      ("hello", "world"),
      (1.1, 2.2, 3.3),
      ("hello", 2, 3, 4, 5)
    )){
      val result = tuple match {
        case (0, _, _) => "0 ..."
        case (x, 0, z) => "x = " + x + ", z = " + z
        case (x, y, z) => "x = " + x + ", y = " + y + ", z = " + z
        case _ => "Unknown"
      }
      println(result)
    }
  }
}
