package com.spotright.scalaexamples

import scala.annotation.tailrec

object LongestPrefix {

  @tailrec def longestPrefix(strings: List[String])(implicit prefix: String = strings.head): Int = {

    if(prefix.isEmpty) -1
    else if(strings.map(_.take(prefix.length)).count(_ == prefix) == strings.length) prefix.length
    else longestPrefix(strings)(prefix.substring(0, prefix.length - 1))
  }

  def main(av: Array[String]): Unit = {

    val strings = List("runway", "runway24", "runaway")
    val prefixLength: Int = longestPrefix(strings)

    prefixLength match {
      case -1 => println("There is no common prefix among these strings")
      case _  => println("The length of the longest common prefix is " + prefixLength)
    }
  }
}