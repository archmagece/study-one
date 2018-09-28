package org.beansugar.study.hello

/**
  * @author archmagece
  * @since 2017-01-25 15
  */
object ComplexNumbers {
	def main(args: Array[String]): Unit ={
		val c = new Complex(1.2, 3.4)
//		println("imaginary part: " + c.im())
		println("imaginary part: " + c.im)
		println(c)
	}
}
