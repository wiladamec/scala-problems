package com.spotright.scalaexamples

import datastructures.PairingHeap

object PairingHeapDemo {

  def main(av: Array[String]): Unit = {

    val heap: PairingHeap[Int] = new PairingHeap[Int]
    val ints = List(16, 86, 900, 234, 183, 4, 7, 560, 2, 35, 51, 8, 44)

    println("Adding elements to heap...")
    ints.foreach(heap.insert(_))
    println(heap)
    println("\nRemoving the min element...")
    heap.removeMin()
    println(heap)
    println("\nClearing the heap...")
    heap.clear()
    println(heap)
    println("\nRe-adding the elements to heap...")
    ints.foreach(heap.insert(_))
    println(heap)
    println("\nRemoving all the elements one-by-one. Takes a few seconds...")
    while(heap.nonEmpty) heap.removeMin()
    println(heap)
  }
}