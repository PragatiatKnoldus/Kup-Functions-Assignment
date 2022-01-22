package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class HigherOrderFunctionTest extends AnyFlatSpec {

  val hof = new HigherOrderFunction

  "A condition" should "increment the value by one" in {
    assert(4 == hof.higherOrderFunction(hof.addOne, 3))
  }
  "A condition" should "increment the value by two" in {
    assert(7 == hof.higherOrderFunction(hof.addTwo, 5))
  }
}