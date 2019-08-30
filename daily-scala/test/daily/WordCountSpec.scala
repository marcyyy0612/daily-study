package daily

import org.scalatest.FunSpec

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class WordCountSpec extends FunSpec {
  describe("#countFruitsFromLines") {
    val wordCount = new WordCount 

    describe("List(apple banana, orange apple mango, kiwi papaya orange,mango orange muscat apple) を 渡したとき") {
      it("Map(banana -> 1, muscat -> 1, orange -> 3, mango -> 2, apple -> 3, kiwi -> 1, papaya -> 1) を返す") {
        val lines = List("apple banana", "orange apple mango", "kiwi papaya orange","mango orange muscat apple")
        val expect = Map("banana" -> 1, "muscat" -> 1, "orange" -> 3, "mango" -> 2, "apple" -> 3, "kiwi" -> 1, "papaya" -> 1)
        val actual = wordCount.countFruitsFromLines(lines)
        assert(actual == expect)
      }
    }
  }
}
