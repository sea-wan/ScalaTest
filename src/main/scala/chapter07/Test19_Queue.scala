package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * Author: wanyingfei
 * Date: 2022/4/26 13:58
 * Description:
 * Version: 1.0
 */
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    //创建一个可变队列
    val queue = new mutable.Queue[String]()

    //入队和出队
    queue.enqueue("a","b","c")
    println(queue)
    println(queue.dequeue())
    println(queue)

    println("===========================")

    //不可变队列  , 有密封类
    val queue2 = Queue("a","b","c")
    println(queue2)
    val queue3 = queue2.enqueue("d","e")
    println(queue3)

  }
}
