package org.beansugar.study.hello

import java.text.DateFormat
import java.text.DateFormat._
import java.util.{Date, Locale}

/**
  * @author archmagece
  * @since 2017-01-25 15
  */
object FrenchDate {
	def main(args: Array[String]): Unit ={
		val now = new Date
//		val df = getDateInstance(LONG, Locale.FRENCH)
		val df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH)
		println(df.format(now))
		println(df format now)
	}
}
