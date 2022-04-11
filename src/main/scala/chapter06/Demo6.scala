package chapter06

import scala.collection.mutable.ArrayBuffer

/**
 * Author: wanyingfei
 * Date: 2022/4/6 14:58
 * Description: 可变数组
 * Version: 1.0
 */
object Demo6 {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(34,21,99,100)

    println(arr)
    println(arr2)


    println("========访问元素")
    //访问元素
    println(arr2(0))
    arr2(1)  = 24
    println(arr2(1))

    println("========添加元素")
    //不可变
    val int1 = arr :+ 15
    println(arr)
    println(int1)
    println(arr == int1)

    //可变数组添加元素
    val int2 = arr2 += 15
    println(arr2)
    println(int2)
    println(arr2 == int2)


    77+=:arr2
    println(arr2)
    println(int2)

    arr2.append(11)
    println(arr2)
    arr2.prepend(200 , 100)  //头部追加
    println(arr2)
    arr2.insert(1, 13)
    println(arr2)

    arr2.insertAll(1,int2)
    println(arr2)


    //删除
    arr2.remove(2,4)
    println(arr2)

    arr2 -= 11
    println(arr2)


    //转换为 可变和不可变 数组
    val arrBu = ArrayBuffer(10,50)
    val array = arr.toArray  //转为不可变

    val buffer = array.toBuffer  //转为可变



  }
}
