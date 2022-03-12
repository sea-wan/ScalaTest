package chapter04

import scala.language.postfixOps

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    //java for语法: for(int i = 0 ; i < 10 ; i++)

    //范围遍历
    for (i <-  1 to 10){
      println(i)
    }

    println("============")

    for (j <-  1.to(10)){
      println(j)
    }

    println("============")

    for (i <- Range(1,10)){
      println( i )
    }

    println("=========")

    for (i <- 1 until 10){  //前闭后开
      println(i)
    }

    println("=========")

    //集合遍历
    for (i <- Array(12,34,54)){
      println(i)
    }

    println("=========")

    //循环守卫
    for (i <- 1 to 10 if i !=2){
      println(i)
    }

    println("=========")

    //循环步长
    for (i <- 1 to 10 by 2){
      println(i)
    }

    for (i <- 1 to 10 reverse){
      println(i)
    }

    println("=========")

    for ( i <- 1 to 3 ; j <- 1 to 3){
      println(i,j)
    }

    println("=========")

    //循环引入变量
    for (i <- 1 to 10){
      val j = 10 - i
      println(i,j)
    }

    println("=========")

    for (i <- 1 to 10 ; j = 10 - i){
      println(i,j)
    }

    for {
      i <- 1 to 10 ;
      j = 10 - i
    }
    {
      println(i,j)
    }

    println("===========")

    //循环返回值
    val a = for (i <- 1 to 10) {
      i
    }
    println(a)

    val b = for (i <- 1 to 10) yield i   //返回一个集合
    println(b)

  }
}
