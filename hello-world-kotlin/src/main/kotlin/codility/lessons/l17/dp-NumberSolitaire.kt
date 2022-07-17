package codility.lessons.l17

import kotlin.math.max

class NumberSolitaire {
	/**
	 * 많이 쓰는 솔루션
	 * 후방으로 스캔
 	 */
	fun solution1(A: IntArray): Int {
		val dp = IntArray(A.size)
		dp[0] = A[0]

		for (i in 1 until A.size) {

			var max = Int.MIN_VALUE

			for (die in 1..6) {
				if (i - die >= 0) {
					max = (dp[i - die] + A[i]).coerceAtLeast(max)
				}
			}
			dp[i] = max
		}
		return dp[A.size - 1]
	}

	class CycleArray(private val arr: IntArray) {
		fun get(i: Int) = arr[i % arr.size]
		fun set(i: Int, value: Int) {
			arr[i % arr.size] = value
		}
	}

	/**
	 * 메모리 사용량 줄여보기
	 */
	fun solution2(A: IntArray): Int {
		val dp = CycleArray(IntArray(A.size))
		dp.set(0, A[0])

		for (i in 1 until A.size) {
			var max = Int.MIN_VALUE
			for (die in 1..6) {
				if (i - die >= 0) {
					max = (dp.get(i - die) + A[i]).coerceAtLeast(max)
				}
			}
			dp.set(i, max)
		}
		return dp.get(A.size - 1)
	}

	/**
	 * 전방으로 보내기
	 */
	fun solution(A: IntArray): Int {
		var sum: Int = A[0]
		val asize = A.size
		var i = 0
		while (i < asize) {
			var biggest = Int.MIN_VALUE
			var biggestIdx = 0
			for (j in 1..6) {
				if (i + j >= asize - 1) {
					biggest = 0
					biggestIdx = A.size
					break
				} else {
					biggestIdx = i + j
					if (A[i + j] >= 0) {
						biggest = A[i + j]
						break
					} else {
						biggest = max(biggest, A[i + j])
					}
				}
			}
			sum += biggest
			i = biggestIdx
		}
		return sum + A[A.size - 1]
	}
}

fun main() {
	NumberSolitaire().apply {
//		solution(intArrayOf(1, -2, 0, 9, -1, -2)).also {
//			println(it)
//			// 8
//		}
//		solution(intArrayOf(0,-4,-5,-2,-7,-9,-3,-10)).also {
//			println(it)
//			//-12
//		}
		solution(intArrayOf(-4, -5, -2, -7, -9, -3, -10, -7, -9, -3, -10, -7, -9, -3, -10)).also {
			println(it)
			//-20
		}
	}
}
