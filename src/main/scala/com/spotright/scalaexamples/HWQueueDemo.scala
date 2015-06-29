package com.spotright.scalaexamples

import datastructures.HighwaterQueue

object HWQueueDemo {

  def main(av: Array[String]): Unit = {

    val hwQueue: HighwaterQueue[Int] = new HighwaterQueue[Int](10, println(_))
    val ints = List(34, 21, 58, 87, 29, 28, 74, 99, 108, 125, 83, 47, 92, 49, 18, 84, 10, 94, 12, 48)
    ints.foreach(elem => hwQueue.enqueue(elem))
  }
}