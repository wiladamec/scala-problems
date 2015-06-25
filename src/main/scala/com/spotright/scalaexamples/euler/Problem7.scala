package com.spotright.scalaexamples.euler

object Problem7 {

  def main(av: Array[String]): Unit = {

    lazy val primeStream: Stream[Int] = 2 #:: Stream.from(3).filter(i => primeStream.takeWhile(j => j * j <= i).forall(i % _ > 0))

    println(primeStream(10000))
  }
}