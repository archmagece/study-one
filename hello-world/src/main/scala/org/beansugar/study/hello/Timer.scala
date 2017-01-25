package org.beansugar.study.hello

/**
  * @author archmagece
  * @since 2017-01-25 15
  */
object Timer {
	def oncePerSecond(callback: () => Unit): Unit ={
		while(true) { callback(); Thread sleep 1000 }
	}
	def timeFlies(): Unit ={
		println("time flies like an arrow... ")
	}
	def main(args: Array[String]): Unit ={
		oncePerSecond(timeFlies)
	}
}
