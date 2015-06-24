package com.spotright.scalaexamples.euler

import scala.collection.mutable.ArrayBuffer

object Problem3 {

  // TODO rewrite this to be faster
  def largestPrimeFactor1(n: Long): Long = {
    var i = 2
    var j = n

    while(i * i < n) {
      while(j % i == 0)
        j = j / i

      i += 1
    }

    j
  }

  def primeFactors(n: Long): List[Long] = {
    (2 to math.sqrt(n).toInt).find(n % _ == 0).fold(List(n))(i => i.toLong :: primeFactors(n / i))
  }

  def main(av: Array[String]): Unit = {

    println(primeFactors(600851475143L).last)
  }
}