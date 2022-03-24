package chapter05

import scala.util.Random

/**
 * @Author: wanyingfei
 * @Date: 2022/3/23 11:11
 * @Description:
 * @Version: 1.0
 */
object Demo2 {
  def main(args: Array[String]): Unit = {

    val salaries = List[Double](1000.2,3000.3,4930.53,9845892.492,10000.15)

    def smallPromotion (salaries: List[Double]): (String,String)=> String = {
      salaries.map( salaries => salaries * 1.1)
      (b: String, n: String) => s"${b}-${n}"
    }


    val pulllist = smallPromotion(salaries)
    println(pulllist)
    val printer = pulllist("a","b")
    println(printer)






    //switch
    val a = Random.nextInt(10)
    val b = 10

    def matchTest = a match {
      case 10 => "十"
      case _ => "其他"
    }
    println(matchTest(1))
    println(a)


  }

}

class Demo2{

}