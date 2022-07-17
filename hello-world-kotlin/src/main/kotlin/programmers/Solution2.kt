package programmers


class Solution2 {
	val pattern = "[a-z\\d-_.]".toRegex()
	val allowedSet = ('a'..'z').toSet() + ('0'..'9').toSet() + setOf('-', '_', '.')

	// 1
	fun condition1(newId: String): String {
		return newId.lowercase()
	}

	// 2
	fun condition2(newId: String): String {
		return newId.filter {
			it in allowedSet
		}
	}

	// 3
	fun condition3(newId: String): String {
		return newId.replace("\\.+".toRegex(), ".")
	}

	// 4
	fun condition4(newId: String): String {
		var result = newId
		if (result.startsWith('.')) {
			result = result.substring(1)
		}
		if (result.endsWith('.')) {
			result = result.substring(0, result.length - 1)
		}
		return result
	}

	// 5
	fun condition5(newId: String): String {
		return newId.ifBlank {
			"a"
		}
	}

	// 6
	fun condition6(newId: String): String {
		return if (newId.length > 15) {
			newId.substring(0, 15)
		} else {
			newId
		}
	}

	// 7
	fun condition7(newId: String): String {
		return if (newId.length == 2) {
			newId + newId[newId.length - 1]
		} else if (newId.length == 1) {
			newId + newId[newId.length - 1] + newId[newId.length - 1]
		} else {
			newId
		}
	}

	fun solution(new_id: String): String {
		val answer = condition1(new_id)
			.let(::condition2)
			.let(::condition3)
			.let(::condition4)
			.let(::condition5)
			.let(::condition6)
			.let(::condition4)
			.let(::condition7)
		return answer
	}
}

fun main() {
	Solution2().apply {
		solution("...!@BaT#*..y.abcdefghijklm").also {
			println(it)
		}
		solution("z-+.^.").also {
			println(it)
		}
		solution("=.=").also {
			println(it)
		}
		solution("123_.def").also {
			println(it)
		}
		solution("abcdefghijklmn.p").also {
			println(it)
		}
		solution("b.").also {
			println(it)
		}
	}
}