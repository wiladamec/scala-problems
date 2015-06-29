package com.spotright.scalaexamples.datastructures

import scala.collection.mutable

class HighwaterQueue[A](hwSize: Int, func: A => Unit) {

  require(hwSize > 0, "Highwater size must be a positive integer.")

  private val queue: mutable.Queue[A] = new mutable.Queue[A]()

  def isEmpty: Boolean = {

    this.queue.isEmpty
  }

  def size: Int = {

    this.queue.size
  }

  def enqueue(elem: A): Unit = {

    this.queue.enqueue(elem)

    if(this.size == hwSize) {
      (1 to this.size).foreach { i => func(this.dequeue.get) }
    }
  }

  def dequeue: Option[A] = {

    if(this.queue.nonEmpty) {
      Some(this.queue.dequeue())
    } else {
      None
    }
  }

  def peek: Option[A] = {

    if(this.queue.nonEmpty) {
      this.queue.headOption
    } else {
      None
    }
  }
}
