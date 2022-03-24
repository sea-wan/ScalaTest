package object chapter06 {  //包对象，全局共享属性和方法
  val commonValue = "包对象下的属性"
  def commonMethod()={
    println(s"这是一个${commonValue}")
  }
}
