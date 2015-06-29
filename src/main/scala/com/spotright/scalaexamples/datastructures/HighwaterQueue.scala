package com.spotright.scalaexamples.datastructures

import scala.collection.mutable.ArrayBuffer

class HighwaterQueue[A](hwSize: Int, func: A => Unit) {

  private val queue: ArrayBuffer[A] = ArrayBuffer[A]()
  var length: Int = 0

  def isEmpty: Boolean = {

    this.length == 0
  }

  def enqueue(elem: A): Unit = {

    this.queue.append(elem)
    this.length += 1

    if(this.length == hwSize) {
      (1 to this.length).foreach { i => func(this.dequeue.get) }
    }
  }

  def dequeue: Option[A] = {

    if(!this.isEmpty) {
      val elem = queue.head
      this.queue.remove(0)
      this.length -= 1

      Some(elem)
    } else {
      None
    }
  }

  def peek: Option[A] = {

    if(!this.isEmpty) {
      Some(this.queue.head)
    } else {
      None
    }
  }
}
