package programmers

import kotlin.math.abs

class Solution5 {
	fun reduction(a: Int, b: Int): Pair<Int, Int> {
		return Pair(a / gcd(a, b), b / gcd(a, b))
	}

	fun gcd(_a: Int, _b: Int): Int {
		var a: Int = _a
		var b: Int = _b
		var r: Int
		while (b != 0) {
			r = a % b
			a = b
			b = r
		}
		return abs(a)
	}

	fun solution(w: Int, h: Int): Long {
		var bigger: Int
		val (a, b) = if (w > h) {
			reduction(w, h).also {
				bigger = w
			}
		} else {
			reduction(h, w).also {
				bigger = h
			}
		}

		var cnt: Long = 0
		var currH: Int = 1
		for(i in 1 .. a) {
			if (b.toDouble() / a.toDouble() * i.toDouble() <= currH) {
				cnt += 1
			} else {
				cnt += 2
				currH++
			}
		}
		return (w.toLong() * h.toLong()) - cnt * (bigger / a)
	}
}

fun main() {
	Solution5().apply {
//		solution(8, 12).also {
//			println(it)
//		}
		solution(800_0000, 1200_0000).also {
			println(it)
		}
	}
}