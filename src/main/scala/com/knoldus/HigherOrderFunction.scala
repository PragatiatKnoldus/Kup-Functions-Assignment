package com.knoldus

class HigherOrderFunction {

  def addOne(element: Int): Int = element + 1

  def addTwo(element: Int): Int = element + 2

  val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    def apply(function: Int => Int, value: Int): Int = function(value)
  }
}