package chapter05

object Test08_Practice {
  def main(args: Array[String]): Unit = {
    //1
    def fun = (i:Int , s:String , c:Char)=> {
      if (i==0 && s == "" && c == '0') false else true
    }

    println(fun(0 , "" , '0'))
    println(fun(23 , "" , '0'))

    println("==================华丽的分割线=============")

    //2
    def func(i: Int): String =>(Char=>Boolean)={
      def f1(s: String): Char=>Boolean ={
        def f2(c :Char): Boolean ={
          if (i==0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))


    println("==================华丽的分割线=============")

    //匿名函数简写   匿名函数不需要返回值类型
    def func1(i: Int): String =>(Char=>Boolean)={
      s => c => if (i==0 && s == "" && c == '0') false else true
    }

    println(func1(0)("")('0'))


    println("==================华丽的分割线=============")


    //柯里化
    def func2(i: Int)(s :String)(c: Char): Boolean={
      if (i==0 && s == "" && c == '0') false else true
    }

    println(func1(0)("")('0'))

  }
}
