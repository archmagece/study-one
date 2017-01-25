package org.beansugar.study.hello

/**
  * @author archmagece
  * @since 2017-01-25 15
  */
object ScalaNumber {
	def main(args: Array[String]): Unit ={
		val x = 10
		println(1 + 2)
		println(1 + 2 * 3)
		println(2 * 3 / x)
		println(1 + 2 * 3 / x)

		println("======================")

		println(1.+(2))
		println(1.+(2.*(3)))
		println(2.*(3)./(x))
		println(1.+(2.*(3)./(x)))
	}
}
