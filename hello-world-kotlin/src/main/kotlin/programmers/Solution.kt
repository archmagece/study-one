//package com.example
//
//interface FuncInOut {
//	fun apply(newId: String): String
//}
//
//class Solution {
//	val pattern = "[a-z\\d-_.]".toRegex()
//	val allowedSet = ('a'..'z').toSet() + ('0'..'9').toSet() + setOf('-', '_', '.')
//	val chain: List<FuncInOut> = listOf(
//		// 1
//		object : FuncInOut {
//			override fun apply(newId: String): String {
//				return newId.lowercase()
//			}
//		},
//		// 2
//		object : FuncInOut {
//			override fun apply(newId: String): String {
//				return newId.filter {
//					it in allowedSet
//				}
//			}
//		},
//		// 3
//		object : FuncInOut {
//			override fun apply(newId: String): String {
//				return newId.replace("\\.+".toRegex(), ".")
//			}
//		},
//		// 4
//		object : FuncInOut {
//			override fun apply(newId: String): String {
//				var result = newId
//				if(result.startsWith('.')){
//					result = result.substring(1)
//				}
//				if(result.endsWith('.')) {
//					result = result.substring(0, result.length - 1)
//				}
//				return result
//			}
//		},
//		// 5
//		object : FuncInOut {
//			override fun apply(newId: String): String {
//				return newId.ifBlank {
//					"a"
//				}
//			}
//		},
//		// 6
//		object : FuncInOut {
//			override fun apply(newId: String): String {
//				return if(newId.length > 15){
//					newId.substring(0, 15)
//				} else {
//					newId
//				}
//			}
//		},
//		object : FuncInOut {
//			override fun apply(newId: String): String {
//				return if(newId.length < 3) {
//					newId + (0..newId.length).map { newId[newId.length] }
//				} else {
//					newId
//				}
//			}
//		},
//	)
//
//	fun solution(new_id: String): String {
//		var answer: String = ""
//		chain.reduceRight { funcInOut, acc ->
//
//			funcInOut.apply(new_id)
//			acc.apply(new_id)
//		}
//
//		return answer
//	}
//}
//
//fun main() {
//	val result1 = Solution().solution("kkkk23")
//	println(result1)
//}