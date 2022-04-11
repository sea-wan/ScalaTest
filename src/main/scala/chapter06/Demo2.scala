package chapter06

import scala.util.Random

/**
 * Author: wanyingfei
 * Date: 2022/4/1 14:46
 * Description:
 * Version: 1.0
 */
object Demo2 {
  def main(args: Array[String]): Unit = {
    val n = Random.nextInt(10)
    n%2 match {
      case 1 => println(s"$n,余1")
      case _ => println(s"$n,余0")
    }


    val planetDistanceFromSun = List(("Mercury",57.9),("Venus",108.2),("Earth",149.6))
    planetDistanceFromSun.foreach{
      tuple => {
        tuple match {
          case ("Mercury",distance) => println(s"Mercury is $distance millions km from sum")
          case p if(p._1 == "Venus") => println(s"Venus is ${p._2} millions km from sum")
          case p if(p._1 == "Earth") => println(s"Earth is ${p._2} millions km from sum")
        }
      }
    }

    val ingredent = (25,"sun"):Tuple2[Int,String]
    println("this is "+ingredent._1)
    println("this is "+ingredent._2)

    val (age,star) = ingredent
    println(age)
    println(star)


    println("===================")

    
  }
}


class Person3{
  val name = "ali"

}

