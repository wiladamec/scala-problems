package com.spotright.scalaexamples.euler

object Problem5 {

  def main(av: Array[String]): Unit = {

    val lcm = Iterator.range(2520, Int.MaxValue, 2520).find(n => (11 to 20).forall(n % _ == 0)).get

    println(lcm)
  }
}