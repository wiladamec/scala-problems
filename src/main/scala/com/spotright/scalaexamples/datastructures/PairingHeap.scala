package com.spotright.scalaexamples.datastructures

class PairingHeap[A]()(implicit ordering: Ordering[A]) {

  var size: Int = 0
  private var root: PairNode[A] = new PairNode[A]()

  def isEmpty: Boolean = {

    this.root.elem == null && this.size == 0
  }

  def nonEmpty: Boolean = {

    !isEmpty
  }

  def min: A = {

    if(nonEmpty) this.root.elem
    else throw new NoSuchElementException("heap is empty")
  }

  def insert(elem: A): Unit = {

    if(nonEmpty) this.root = merge(new PairNode[A](elem), root)
    else this.root = new PairNode[A](elem)
    this.size += 1
  }

  def removeMin(): Unit = {

    if(nonEmpty) {
      this.size -= 1
      this.root = mergePairs(this.root.children)
    } else {
      throw new NoSuchElementException("heap is empty")
    }
  }

  def clear(): Unit = {

    if(nonEmpty) {
      this.root = new PairNode[A]()
      this.size = 0
    }
  }

  override def toString: String = {

    if(nonEmpty) "PairingHeap(" + this.size + ") " + this.root.toString
    else "PairingHeap(0)"
  }

  private def merge(ltHeap: PairNode[A], rtHeap: PairNode[A])(implicit ordering: Ordering[A] = ordering): PairNode[A] = {

    if (ordering.compare(ltHeap.elem, rtHeap.elem) < 0) new PairNode[A](ltHeap.elem, rtHeap :: ltHeap.children)
    else new PairNode[A](rtHeap.elem, ltHeap :: rtHeap.children)
  }

  private def mergePairs(children: List[PairNode[A]]): PairNode[A] = {

    if (children.isEmpty) new PairNode[A]()
    else if (children.length == 1) children.head
    else merge(merge(children.head, children.apply(1)), mergePairs(children.drop(2)))
  }
}

class PairNode[A](var elem: A = null.asInstanceOf[A], implicit var children: List[PairNode[A]] = List()) {

  def isEmpty: Boolean = {

    elem == null
  }

  override def toString: String = {

    var str = "(" + elem + ", {"
    children.foreach(ch => str += ch.toString + " ")
    str += "})"

    str
  }
}
