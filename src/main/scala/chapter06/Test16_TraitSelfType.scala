package chapter06

/**
 * Author: wanyingfei
 * Date: 2022/4/18 14:59
 * Description:
 * Version: 1.0
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
      val user = new RegisterUser("hah", "123456")
      user.insert()
  }
}

//用户类
class User(val name: String, val password: String)

trait UserDao{
  //自身类型
  _: User =>

  //像数据库插入数据
  def insert()={
    println(s"insert into db: ${this.name}")
  }
}

//定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao
