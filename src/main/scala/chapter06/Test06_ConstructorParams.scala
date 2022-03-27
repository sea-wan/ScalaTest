package chapter06

object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student = new Student2
    student.name="ali"
    student.age =20
    println(s"student2: name = ${student.name} , age = ${student.age}")

    println("==============")

    val bi = new Student3("bi", 21)
    println(s"student3: name = ${bi.name} , age = ${bi.age}")

    val stu4 = new Student4("bib", 212)
//    println(s"student4: name = ${stu4.name} , age = ${stu4.age}")
    stu4.printInfo()
  }
}

//定义类
//无参构造器
class Student2 {
  //单独定义属性
  var name: String = _
  var age: Int = _
}

//上面定义等价于,       属性,     推荐此方式
class Student3(var name: String, var age: Int)

//主构造器参数无修饰,    仅是形参,不是属性
class Student4(name: String, age: Int){
  def printInfo(): Unit ={
    println(s"student4: name = ${name} , age = ${age}")
  }
}

 

//class Student44(_name: String, _age: Int){
//  var name: String = _name
//  var age: Int = _age
//}


class Student5(val name: String, val age: Int)



