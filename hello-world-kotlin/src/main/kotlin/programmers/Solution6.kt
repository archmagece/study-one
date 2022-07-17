//package com.example
//
//class Solution6 {
//	fun dfs(i: Int, j: Int, computers: Array<IntArray>): Set<Int> {
//		if(computers[i][j] == 1){
//			dfs(i++, j)
//		} else {
//			return
//		}
//	}
//
//	fun solution(n: Int, computers: Array<IntArray>): Int {
//		val checked =
//		val netset = mutableListOf<MutableSet<Int>>()
//		for (i0 in 0 until n) {
//			for (i1 in i0 + 1 until n) {
//				println("$i0 - $i1 - ${computers[i0][i1]}")
//				if (computers[i0][i1] == 1) {
//					var x0 = true
//					var toremove: Int? = null
//					netset.forEachIndexed { idx, it ->
//						if (i0 in it || i1 in it) {
//							if (x0) {
//								it.add(i0)
//								it.add(i1)
//								x0 = false
//							} else {
//								it.remove(i0)
//								it.remove(i1)
//								if (it.size == 0) {
//									toremove = idx
//								}
//							}
//						}
//					}
//					if(toremove != null){
//						netset.removeAt(toremove!!)
//					}
//					if (x0) {
//						netset.add(mutableSetOf(i0, i1))
//					}
//				} else {
//					var x0 = false
//					var x1 = false
//					netset.forEach {
//						if (i0 in it) {
//							x0 = true
//						}
//						if (i1 in it) {
//							x1 = true
//						}
//					}
//					if (!x0) {
//						netset.add(mutableSetOf(i0))
//					}
//					if (!x1) {
//						netset.add(mutableSetOf(i1))
//					}
//				}
//			}
//		}
//
//		return netset.size
//	}
//}
//
//fun main() {
//	Solution6().apply {
//		solution(
//			3, arrayOf(
//				intArrayOf(1, 1, 0),
//				intArrayOf(1, 1, 0),
//				intArrayOf(0, 0, 1),
//			)
//		).also {
//			println(it)
//		}
//
//		solution(
//			3, arrayOf(
//				intArrayOf(1, 1, 0),
//				intArrayOf(1, 1, 1),
//				intArrayOf(0, 1, 1),
//			)
//		).also {
//			println(it)
//		}
//	}
//}
