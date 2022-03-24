//用嵌套风格定义包
package com{
  //在外层包中定义单例对象
  object Outer{
    var out: String="out"
  }
  package gui{
    package scala{
      //内层包中定义单例对象
      object Innner{
        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}