package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/6 15:51
 * Description: List
 * Version: 1.0
 */
object Demo8 {
  def main(args: Array[String]): Unit = {
    val list = List(10,20,30,40,50)

    println(list(1))

    val list2 = 10 +: list
    println(list2)
    val list3 = list2 :+ 100
    println(list3)


    val list4 = list2.::(510)
    println(list4)

    //Nil空集合
    val list5 = Nil.::(101)
    println(list5)

    val list6 = 1::2::3::4::5::Nil
    println(list6)

    //合并list
    val list7 = list5 ::: list6
    println(list7)

    val list8 = list5 ++ list6
    println(list8)
  }
}
