package programmers

class Solution4 {
	fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
		val reportCnt = id_list.associateWith { 0 }.toMutableMap()
		val reporter = id_list.associateWith { mutableSetOf<String>() }.toMutableMap()
		(report.toSet()).forEach { kv ->
			val (k, v) = kv.split("\\s".toRegex())
			if (v in reportCnt.keys) {
				reportCnt.merge(v, 1, Int::plus)
				reporter[v]!!.add(k)
			}
		}
		val result = reporter.values.filter { it.size >= k }.flatten().groupingBy { it }.eachCount()
		return id_list.map {
			result[it] ?: 0
		}.toIntArray()
	}
}

fun main() {
	Solution4().apply {
		solution(
			arrayOf("muzi", "frodo", "apeach", "neo"),
			arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
			2
		).also {
			it.forEach(::print)
			println()
		}
		solution(arrayOf("con", "ryan"), arrayOf("ryan con", "ryan con", "ryan con", "ryan con"), 3).also {
			it.forEach(::print)
			println()
		}
	}
}