package com.spotright.scalaexamples.euler

import scala.annotation.tailrec

object Problem2 {

  @tailrec def fib(firstTerm: Int, secondTerm: Int, max: Int, fibSeq: List[Int]): List[Int] = {

    if(firstTerm > max) fibSeq.reverse
    else fib(secondTerm, firstTerm + secondTerm, max, firstTerm :: fibSeq)
  }

  def main(av: Array[String]): Unit = {

    println(fib(1, 2, 4000000, Nil).filter(_ % 2 == 0).sum)
  }
}