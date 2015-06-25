package com.spotright.scalaexamples.euler

object Problem5 {

  def main(av: Array[String]): Unit = {

    /**
     * Some notes so I remember what I did here...
     *
     * Since 2520 is divisible by 1 ... 10, we know that:
     *
     * 1. Any number divisible by 1 ... 10 is a multiple of 2520
     * 2. Any multiple of 2520 will be divisible by 1 ... 10
     *
     * This significantly reduces the number of checks we have to do. We can check
     * only multiples of 2520 starting with 2520*2, and check for divisibility by
     * only 11 ... 20.
     *
     * It's brute forcing, but with care. :)
     */

    val lcm = Iterator.range(5040, Int.MaxValue, 2520).find(n => (11 to 20).forall(n % _ == 0)).get

    println(lcm)
  }
}