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

    describe("give 3") {
      it("return Fizz") {
        val expect = "Fizz"
        val actual = fizzBuzz.execute(3)
        assert(actual == expect)
      }
    }
  }
}

