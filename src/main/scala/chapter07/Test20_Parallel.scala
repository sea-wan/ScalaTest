package chapter07

import scala.collection.immutable
//import scala.collection.parallel.immutable.ParSeq


/**
 * Author: wanyingfei
 * Date: 2022/4/26 14:06
 * Description:
 * Version: 1.0
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val strings: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread().getId
    )
    println(strings)

//    val result2: ParSeq[Long] = (1 to 100).par.map(
//      x => Thread.currentThread().getId
//    )
//    println(strings)
  }
}
