package chapter04

object Test03_Practice_MulTable {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9 ){
      for ( j <- 1 to i) {
        print(s"$j * $i = ${j * i} \t")
      }
      println()
    }

    println("========")

    for (i <- 1 to 9 ; j <- 1 to i){
      print(s"$j * $i = ${j*i} \t")
      if ( j == i) println()
    }

  }
}
