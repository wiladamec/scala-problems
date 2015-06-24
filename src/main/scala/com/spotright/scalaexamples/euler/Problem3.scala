package com.spotright.scalaexamples.euler

import scala.collection.mutable.ArrayBuffer

object Problem3 {

  def primeFactors(n: Long): List[Long] = {
    (2 to math.sqrt(n).toInt).find(n % _ == 0).fold(List(n))(i => i.toLong :: primeFactors(n / i))
  }

  def main(av: Array[String]): Unit = {

    println(primeFactors(600851475143L).last)
  }
}