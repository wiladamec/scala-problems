package com.spotright.scalaexamples.euler

object Problem6 {

  def main(av: Array[String]): Unit = {

    val sumSquares: Int = (1 to 100).map(Math.pow(_, 2)).sum.toInt
    val squareSum: Int = Math.pow((1 to 100).sum, 2).toInt

    println(squareSum - sumSquares)
  }
}