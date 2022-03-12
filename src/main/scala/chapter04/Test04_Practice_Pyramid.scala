package chapter04

object Test04_Practice_Pyramid {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      val stars = 2 * i -1
      val spaces = 9 - i
      println(" " * spaces + "*" * stars)
    }

    println("=================")

    for (i <- 1 to 9 ; stars = 2 * i -1 ; spaces = 9 - i){
      println(" " * spaces + "*" * stars)
    }
  }
}
