package cc.xstack

object HelloScala {
  
  def foo(x : Array[String]): String = x.foldLeft("")((a, b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello Scala World!" )
    println("concat arguments = " + foo(args))
  }

}
