package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    val name = "alice"
    val age = 81
    println( age + "岁" + name + "学习")


    //* 用于将一个字符串复制多次拼接
    println(name * 3)

    //printf用法 字符串，通过%传值
    printf("%d岁%s在学", age , name)

    println()
    //字符串模板（插值字符串），通过$获取变量值
    println(s"${age}岁的${name}在学习")

    println(s"${age}岁的${name}在学习")


    val num= 2.34 //默认Double
    println(f"The num is ${num}%2.2f") // 格式话模板字符串

    //三引号表示字符串,保持多行字符串的原格式输出
    val sql = s"""
       |select
       |*
       |from
       |  employee
       |where
       |  name = ${name}
       |""".stripMargin
    println(sql)
  }
}
