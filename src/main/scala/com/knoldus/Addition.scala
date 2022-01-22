package com.knoldus

class Addition {

  val add: Function2[Int,Int,Int] = new Function2[Int,Int,Int] {
    def apply(firstValue: Int, secondValue: Int): Int = firstValue + secondValue
  }
}