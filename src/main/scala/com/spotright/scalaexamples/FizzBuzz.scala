package com.spotright.scalaexamples

object FizzBuzz {

  def main(av: Array[String]): Unit = {

    (1 to 100).foreach { i =>
      var fbString = ""

      if (i % 3 == 0) fbString += "Fizz"
      if (i % 5 == 0) fbString += "Buzz"
      if (fbString.isEmpty) fbString += i

      println(fbString)
    }
  }
}