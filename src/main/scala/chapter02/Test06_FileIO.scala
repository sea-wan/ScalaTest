package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    //从文件中读取数据
    Source.fromFile("src/main/resources/Test.txt").foreach(print)

    //将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/outpput.txt"))
    writer.write(
      "hello scala from java writer"
    )
    writer.close()
  }

}
