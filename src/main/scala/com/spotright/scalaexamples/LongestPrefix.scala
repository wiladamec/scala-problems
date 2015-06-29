package com.spotright.scalaexamples

import scala.annotation.tailrec

object LongestPrefix {

  @tailrec def longestPrefix(strings: List[String])(implicit prefix: String = strings.head): Int = {

    if(strings.map(_.take(prefix.length)).count(_ == prefix) == strings.length) prefix.length
    else longestPrefix(strings)(prefix.substring(0, prefix.length - 1))
  }

  def main(av: Array[String]): Unit = {

    val strings = List("runway", "runway24", "runaway")
    println(s"The length of the longest common prefix is ${longestPrefix(strings)}")
  }
}