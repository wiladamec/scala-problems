package com.spotright.scalaexamples.euler

object Problem1 {

  def main(av: Array[String]): Unit = {

    for(i <- 1 until 1000 if i % 3 == 0 || i % 5 == 0) println(i)
  }
}