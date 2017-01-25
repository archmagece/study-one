package org.beansugar.study.hello

/**
  * @author archmagece
  * @since 2017-01-25 15
  */
abstract class Tree {
	case class Sum(1: Tree, r: Tree) extends Tree
	case class Var(n: String) extends Tree
	case class Const(v: Int) extends Tree
}
