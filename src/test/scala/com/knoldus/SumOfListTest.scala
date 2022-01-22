package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SumOfListTest extends AnyFlatSpec {

  val listSum = new SumOfList

  "A condition" should "give sum of all the positive integers present in the list" in {
    assert(19 == listSum.sumOfList(List(5, 7, 3, 4)))
  }
  "A condition" should "give sum of all positive and negative numbers in the list." in {
    assert(5 == listSum.sumOfList(List(4, 8, -6, -1)))
  }
}