package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/20 15:02
 * Description:不可变
 * Version: 1.0
 */
object Test04_List {
  def main(args: Array[String]): Unit = {
    //创建一个List
    val list = List(1, 2, 3, 4, 5)
    println(list)

    //获取list元素
//    println(list(1))  //可以像数组一样访问
    list.foreach(println)

    println("===========================")
    //添加元素
    val list2 = list :+ 6
    val list3 = 6 +: list
    println(list2)
    println(list3)

    println("===========================")

    //list特有的方法
    val value = list2.::(7) //添加到头部
    println(value)

    val list5 = Nil.::(12) //Nil是一个空的List,创建空的List
    println(list5)

    val list6 = 13 :: 12 :: Nil //创建一个List
    val list7 = 12 :: 18 :: 84 :: 45 :: Nil
    println(list6)
    println(list7)

    println("===========================")
    //合并List
    val list8 = list6 :: list7
    println(list8)

    val list9 = list6 ::: list7 //合并到一个List，扁平化
    println(list9)

    val list10 = list6 ++ list7 //合并到一个List，扁平化，相当于:::
    println(list10)
  }
}
