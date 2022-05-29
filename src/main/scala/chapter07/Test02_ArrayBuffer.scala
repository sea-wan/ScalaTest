package chapter07

import scala.collection.mutable.ArrayBuffer

/**
 * Author: wanyingfei
 * Date: 2022/4/20 14:24
 * Description:
 * Version: 1.0
 */
object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //创建可变数组
    val arr1 = ArrayBuffer[Int]() //不需要定义数组的长度,不需要new
    //创建可变数组另一种
    val arr2 = ArrayBuffer(23,45,67)

    println(arr1)
    println(arr1.mkString(",")) //空数组
    println(arr2.mkString(","))
    println(arr2) //默认调用toString方法

    //访问数组元素，不要越界
    println(arr2(0)) //访问第一个元素

    //修改数组元素
    arr2(0) = 100 //修改第一个元素
    println(arr2(0))

    //添加元素
    val newArr1 = arr1 :+ 23 //在末尾添加元素
    println(arr1)
    println(newArr1)

    //添加元素，可变数组推荐使用+=
    arr1 += 19 //在末尾添加元素
    println(arr1)

    77 +=: arr1 //在开头添加元素
    println(arr1)

    //可变数组推荐使用方法操作数组
    arr1.insert(1,100) //在第二个位置插入元素
    println(arr1)
    //追加
    arr1.append(200)
    arr1.prepend(1000)
    println(arr1)

    //arr1添加一个数组
    arr1.insertAll(1,arr1)
    arr1.prependAll(arr1)
    println(arr1)

    //删除元素
    arr1.remove(1) //删除第二个元素
    println(arr1)

    arr1.remove(0,10) //删除前10个元素
    println(arr1)


    //可变数组转换为不可变数组
    val arr3 = arr1.toArray
    println(arr3.mkString(","))

    //不可变数组转换为可变数组
    val arr4 = arr3.toBuffer
    println(arr4.mkString("-"))
  }
}
