package programmers

class Solution3 {
	fun solution(numbers: IntArray): Int {
		return ((0..9).toSet() - numbers.toSet()).sum()
	}
}

fun main(){
	Solution3().apply {
		val v1 = arrayOf(1,2,3,4)
		solution(v1.toIntArray()).let {
			println(it)
		}
	}
}