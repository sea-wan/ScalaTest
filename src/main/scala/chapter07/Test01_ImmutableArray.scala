package chapter07

/**
 * Author: wanyingfei
 * Date: 2022/4/20 13:44
 * Description:在Scala当中推荐不可变数组，因为它们更加简洁，更加灵活，更加安全。
 * 推荐使用符号处理数组
 * Version: 1.0
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //创建数组
    val arr = new Array[Int](10)
    //另一种创建数组的方式
    val arr2 = Array(1, 2, 3, 4, 5)

    //访问数组元素
    println(arr(0))
    println(arr2(0))

    //修改数组元素
    arr(0) = 100
    arr(4) = 400

    println(arr(0))
    println(arr(4))

    println("------------------")
    //遍历数组for循环
    for (i <- 0 until arr.length){
      println(arr(i))
    }

    println("------------------")
    //遍历数组indices
    for (i <- arr.indices){
      println(arr(i))
    }

    println("------------------")
    //遍历数组增强for循环
    for (i <- arr){
      println(i)
    }

    println("------------------")
    //遍历数组foreach
    //arr.foreach( (x:Int) => println(x) )
    arr.foreach(println) //简写

    println("------------------")
    //遍历数组iterator迭代器
    val it = arr.iterator
    while (it.hasNext){
      println(it.next())
    }

    println("------------------")
    //遍历数组mkString
    println(arr.mkString(","))


    //添加元素，返回新的数组
    val arr3 = arr :+ 100
    println(arr3.mkString(","))
    val arr4 = arr :+ (100, 200)
    println(arr4.mkString(","))

    //添加元素，追加到数组前端
    val arr5 = arr.+:(1000)
    println(arr5.mkString(","))

    val arr6 = 1000 +: arr
    println(arr6.mkString(","))

    println("------------------")

    //删除元素，返回新的数组
    val arr7 = arr.drop(1)
    println(arr7.mkString(","))
  }
}
