package org.beansugar.study.hello

/**
  * @author archmagece
  * @since 2017-01-25 15
  */
class Complex (real:Double, imaginary:Double){
//	def re() = real
//	def im() = imaginary
	def re = real
	def im = imaginary
	override def toString() =
	"" + re + (if (im < 0) "" else "+") + im + "i"
}
