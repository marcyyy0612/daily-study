package daily

import org.scalatest.FunSpec

class S99Spec extends FunSpec {
  val s99 = new S99

  describe("#duplicate") {
    describe("Duplicate List('a','b','c','c','d')") {
      it("return List('a','a','b','b','c','c','c','c','d','d')") {
        val expected = List("a","a","b","b","c","c","c","c","d","d")
        val actual = s99.duplicate(List("a","a","b","b","c","c","c","c","d","d"))
        assert(actual == expected)
      }
    }
  }
//
//  describe("#duplicateN") {
//    describe("Duplicate List('a','b','c','c','d') 3 times") {
//      it("return List('a','a','a','b','b','b','c','c','c','c','c','c','d','d','d')") {
//
//      }
//    }
//  }
//
//  describe("#pack") {
//    describe("Given List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
//      it("return List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))") {
//
//      }
//    }
//  }
//
//  describe("#encode") {
//    describe("Given List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
//      it("return List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))") {
//
//      }
//    }
//  }
//
//  describe("#encodeModified") {
//    describe("Given List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')") {
//      it("return List((4,'a'), 'b', (2,'c'), (2,'a'), 'd', (4,'e'))") {
//
//      }
//    }
//  }
//
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