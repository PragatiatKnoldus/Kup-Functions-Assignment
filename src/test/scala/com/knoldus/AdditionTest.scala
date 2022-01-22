package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class AdditionTest extends AnyFlatSpec {

  val adding = new Addition

  "A condition" should "give correct output for two positive numbers" in {
    assert(9 == adding.add(4, 5))
  }
  "A condition" should "give correct output for positive and negative numbers" in {
    assert(7 == adding.add(10, -3))
  }
}