package com.spotright.scalaexamples.euler

object Problem1 {

  def main(av: Array[String]): Unit = {

    val productList = for(i <- 1 until 1000 if i % 3 == 0 || i % 5 == 0) yield i
    println(productList.sum)
  }
}