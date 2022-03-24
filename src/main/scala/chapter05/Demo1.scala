package chapter05

import java.text.DateFormat._
import java.util.{Date, Locale}

/**
 * @Author: wanyingfei
 * @Date: 2022/3/22 13:55
 * @Description:
 * @Version: 1.0
 */
object Demo1 {
  def main(args: Array[String]): Unit = {
    def f(n:Int): Int ={
      println(n)
      n + 1
    }

    val result = f(123)
    println(result)

    println("===========华丽的分割线=============")

    val f1 : Int => Int = f
    println(f1(123))

    IndexedSeq

    println("===========华丽的分割线=============")

    def dualEval(op: (Int, Int)=>Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 35))
    println(dualEval((a, b) => a + b, 12, 35))
    println(dualEval(_ + _, 12, 35))


    println("===========华丽的分割线=============")


    def f5(): Int=>Unit = {
      def f6(a: Int): Unit = {
        println("f6调用 " + a)
      }
      f6    // 将函数直接返回
    }

    //    val f6 = f5()
    //    println(f6)
    //    println(f6(25))

    println(f5()(25))


    println("===========华丽的分割线=============")

    val arr: Array[Int] = Array(12, 45, 75, 98)

    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int=>Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    // 定义一个加一操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    // 调用函数
    val newArray: Array[Int] = arrayOperation(arr, addOne)
    println(newArray.mkString(","))

    // 传入匿名函数，实现元素翻倍
    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(", "))

    println("===========华丽的分割线=============")

    val date = new Date
    val df = getDateInstance(LONG,Locale.UK)
    println(df format date)
  }
}
