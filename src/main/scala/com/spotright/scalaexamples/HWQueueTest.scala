package com.spotright.scalaexamples

import datastructures.HighwaterQueue

object HWQueueTest {

  def main(av: Array[String]): Unit = {

    val hwQueue: HighwaterQueue[Int] = new HighwaterQueue[Int](10, println(_))

    def addToQueue(elem: Int): Unit = {

      hwQueue.enqueue(elem)
      println(s"Enqueued $elem")
      println(s"The size of the queue is ${hwQueue.length}")
      println("")
    }

    val ints = List(34, 21, 58, 87, 29, 28, 74, 99, 108, 125, 83)
    ints.foreach(elem => addToQueue(elem))

    
  }
}