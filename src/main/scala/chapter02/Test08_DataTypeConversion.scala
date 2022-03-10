package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    //自动提升
    val a1 : Byte = 10
    val b1 = 2353L
    val result1 = a1 + b1
    val result2 : Int = (a1 + b1.toInt)  //强制转换类型


    //大转小
    val a2 : Byte = 10
    val b2 : Int  = a2
    val c2 : Byte = b2.toByte


    //byte , short , char 之间不会互相自动转换 , 计算式首先转换为int类型
    val a3 : Byte = 10
    val b3 : Char = 'b'
//    val c3 : Byte = b3   error



    //强制类型转换

  }
}
