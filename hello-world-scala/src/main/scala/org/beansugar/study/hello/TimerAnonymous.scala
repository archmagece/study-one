package org.beansugar.study.hello

/**
  * @author archmagece
  * @since 2017-01-25 15
  */
object TimerAnonymous {
	def oncePerSecond(callback: () => Unit): Unit ={
		while(true) { callback(); Thread sleep 1000 }
	}
	def main(args: Array[String]): Unit ={
		oncePerSecond(() => {
			println("time files like an arrow...")
		})
	}
}
