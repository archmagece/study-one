package codility

class Codility3 {
	fun solution_fail_Large(A: IntArray): Int {
		A.sorted().forEachIndexed { idx, elm ->
			if(idx + 1 != elm) {
				return idx + 1
			}
		}
		return A.size + 1
	}
	fun solution_pass(A: IntArray): Int {
		A.sort()
		for(i in A.indices) {
			if (i + 1 != A[i]) {
				return i + 1
			}
		}
		return A.size + 1
	}

	fun solution(A: IntArray): Int {
		A.sort()
		for(i in A.indices) {
			if (i + 1 != A[i]) {
				return i + 1
			}
		}
		return A.size + 1
	}

	fun search(A: List<Int>, low: Int, high: Int): Int {
		val mid = (low + high) / 2
		if(mid == low){
			return high
		} else if(mid == high){
			return low
		}
		return if(A[mid] <= mid + 1) {
			search(A, A[mid], high)
		} else if(A[mid] == high + 1) {
			return high
		} else {
			search(A, low, A[mid])
		}
	}
}

fun main (){
	Codility3().apply {
		solution(intArrayOf(2,3,1,5)).apply {
			println("result: $this")
		}
		//empty
		solution(intArrayOf()).apply {
			println("result: $this")
		}
		// single
		solution(intArrayOf(1)).apply {
			println("result: $this")
		}
		// missing first
		solution(intArrayOf(2,3,4,5,6,7,8,9,10,11)).apply {
			println("result: $this")
		}
		// missing last
		solution(intArrayOf(1,2,3,4,5,6,7,8,9,10)).apply {
			println("result: $this")
		}
		solution(intArrayOf(1,3)).apply {
			println("result: $this")
		}
	}
}