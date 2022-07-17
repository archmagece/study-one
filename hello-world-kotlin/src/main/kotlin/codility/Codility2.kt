package codility

import kotlin.math.abs

class Codility2 {
	fun solution(X: Int, Y: Int, D: Int): Int {
		val len1 = abs(Y - X)
		return if (len1 % D == 0){
			len1 / D
		} else {
			len1 / D + 1
		}
	}
}

fun main() {
	Codility2().apply {
		solution(10, 85, 30).also {
			println(it)
		}
	}
}