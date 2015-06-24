package com.spotright.scalaexamples.euler

object Problem2 {

  def fib(m: Int, n: Int, max: Int, fibSeq: List[Int]): List[Int] = {

    if(m > max) fibSeq.reverse
    else m :: fib(n, m+n, max, fibSeq)
  }

  def main(av: Array[String]): Unit = {

    println(fib(1, 2, 4000000, Nil).filter{_ % 2 == 0}.sum)
  }
}