package programmers

class Solution5_1 {
	fun reduction(a: Int, b: Int): Pair<Int, Int> {
		return Pair(a / gcd(a, b), b / gcd(a, b))
	}
	fun gcd(n: Int, m: Int): Int = if (m == 0) n else gcd(m, n % m)

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
	Solution5_1().apply {
//		solution(2, 2).also {
//			println(it)
//		}
//		solution(2, 3).also {
//			println(it)
//		}
		solution(8, 12).also {
			println(it)
		}
	}
}