package com.spotright.scalaexamples.euler

object Problem4 {

  def main(av: Array[String]): Unit = {

    println((100 to 999).flatMap(i => (i to 999).map(i * _)).filter(n => n.toString == n.toString.reverse).max)
  }
}