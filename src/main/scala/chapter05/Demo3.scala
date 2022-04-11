package chapter05

/**
 * Author: Phil
 * Date: 2022/3/24 11:15
 * Description:
 * Version: 1.0
 */
object Demo3 {
  def main(args: Array[String]): Unit = {
    val number = "[0-9]".r

    number.findFirstIn("every") match {
      case Some(_) => println("password pass")
//      case none => println("password warn")
    }


    val a = "1292613988@iojoif sdk,.]'vim'17601617705"
    val s = "[\\d+\\w]".r
    println(s.findAllMatchIn(a))
    for( print <- s.findAllMatchIn(a)) println(print)
  }
}
