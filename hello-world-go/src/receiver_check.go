package main

import "fmt"

type Point struct {
	x int
	y int
}

func (p Point) test1() {
	fmt.Println(p)
}
func (p *Point) test2() {
	fmt.Println(p)
}
func test3(p Point) {
	fmt.Println(p)
}
func test4(p *Point) {
	fmt.Println(p)
}

func main() {
	p := Point{1, 2}
	//리시버 타입은 오류남. 리시버는 struct 내부에 정의
	//test1(p)
	//test2(p)
	p.test1()
	p.test2()

	test3(p)
	test4(&p)
}
