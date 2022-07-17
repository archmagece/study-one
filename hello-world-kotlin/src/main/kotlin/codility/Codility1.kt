package codility

class Codility1 {
	fun solution(A: IntArray, K: Int): IntArray {
		val result = IntArray(A.size)
		for (i in A.indices) {
			result[(i + K) % A.size] = A[i]
		}
		return result
	}
}

fun main() {
	Codility1().apply {
		solution(intArrayOf(3,8,9,7,6), 3).also {
			println(it.contentToString())
		}
		solution(intArrayOf(), 3).also {
			println(it.contentToString())
		}
	}
}
