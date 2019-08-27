package daily

import org.scalatest.FunSpec

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class FizzBuzzSpec extends FunSpec {
  describe("#execute") {
    val fizzBuzz = new FizzBuzz

    describe("3の倍数のとき") {
      describe("3のとき") {
        it("return Fizz") {
          val expect = "Fizz"
          val actual = fizzBuzz.execute(3)
          assert(actual == expect)
        }
      }
      describe("6のとき") {
        it("return Fizz") {
          val expect = "Fizz"
          val actual = fizzBuzz.execute(6)
          assert(actual == expect)
        }
      }
    }

    describe("5の倍数のとき") {
      describe("5のとき") {
        it("return Buzz") {
          val expect = "Buzz"
          val actual = fizzBuzz.execute(5)
          assert(actual == expect)
        }
      }
      describe("10のとき") {
        it("return Buzz") {
          val expect = "Buzz"
          val actual = fizzBuzz.execute(10)
          assert(actual == expect)
        }
      }
    }

    describe("3と5の公倍数のとき") {
      describe("15のとき") {
        it("return FizzBuzz") {
          val expect = "FizzBuzz"
          val actual = fizzBuzz.execute(15)
          assert(actual == expect)
        }
      }
      describe("30のとき") {
        it("return FizzBuzz") {
          val expect = "FizzBuzz"
          val actual = fizzBuzz.execute(30)
          assert(actual == expect)
        }
      }
    }

    describe("3の倍数でも、5の倍数でもないとき") {
      describe("4のとき") {
        it("return 4") {
          val expect = "4"
          val actual = fizzBuzz.execute(4)
          assert(actual == expect)
        }
      }
      describe("8のとき") {
        it("return 8") {
          val expect = "8"
          val actual = fizzBuzz.execute(8)
          assert(actual == expect)
        }
      }
    }
  }
}
