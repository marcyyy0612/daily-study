package daily

import org.scalatest.FunSpec

class S99Spec extends FunSpec {
  val s99 = new S99

  describe("#pack") {
    describe("Given List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
      it("return List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))") {
        val expected = List(List("a", "a", "a", "a"), List("b"), List("c", "c"), List("a", "a"), List("d"), List("e", "e", "e", "e"))
        val actual = s99.pack(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
        assert(actual == expected)
      }
    }
  }

 describe("#encode") {
   describe("Given List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
     it("return List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))") {
       val expected = List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))
       val actual = s99.encode(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
       assert(actual == expected)
     }
   }
 }

 describe("#encodeModified") {
   describe("Given List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
     it("return List((4,'a'), 'b', (2,'c'), (2,'a'), 'd', (4,'e'))") {
       val expected = List((4, "a"), "b", (2, "c"), (2, "a"), "d", (4, "e"))
       val actual = s99.encodeModified(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
       assert(actual == expected)
     }
   }
 }

//  describe("#decode") {
//    describe("Given List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))") {
//      it("return List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
//
//      }
//    }
//  }
//
//  describe("#encodeDirect") {
//    describe("Given List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
//      it("return List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))") {
//
//      }
//    }
//  }
}
