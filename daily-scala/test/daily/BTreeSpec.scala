package daily

import org.scalatest.FunSpec

class BTreeSpec extends FunSpec {
  describe("Leaf") {
    val leaf = Leaf(2)
    describe("#size") {
      it("equal 1") {
        assert(leaf.size == 1)
      }
    }

    describe("#max") {
      it("equal 2") {
        assert(leaf.max == 2)
      }

      describe("given Leaf(3)") {
        val leaf2 = Leaf(3)
        it("equal 3") {
          assert(leaf2.max == 3)
        }
      }
    }

    describe("#min") {
      val leaf3 = Leaf(1)
      it("equal 1") {
        assert(leaf3.min == 1)
      }
    }
  }

  describe("Branch") {
    val branch1 = Branch(Leaf(1), 3, Leaf(4))
    val branch2 = Branch(Branch(Leaf(1), 2, Leaf(3)), 4, Leaf(5))
    val branch3 = Branch(Branch(Leaf(1), 2, Leaf(3)), 4, Branch(Leaf(5),6,Leaf(8)))
    val branch4 = Branch(Leaf(2), 3, Leaf(4))
    describe("#size") {
      describe("given Branch(Leaf(1), 3, Leaf(4))") {
        it("return 3") {
          assert(branch1.size == 3)
        }
      }
      describe("given Branch(Branch(Leaf(1), 2, Leaf(3)), 4, Leaf(5))") {
        it("return 5") {
          assert(branch2.size == 5)
        }
      }
    }
    describe("#max") {
      describe("given Branch(Leaf(1), 3, Leaf(4))") {
        it("return 4") {
          assert(branch1.max == 4)
        }
      }
      describe("given Branch(Branch(Leaf(1), 2, Leaf(3)), 4, Leaf(5))") {
        it("return 5") {
          assert(branch2.max == 5)
        }
      }
      describe("given Branch(Branch(Leaf(1), 2, Leaf(3)), 4, Branch(Leaf(5),6,Leaf(8)))") {
        it("return 8") {
          assert(branch3.max == 8)
        }
      }
    }
    describe("#min") {
      describe("Branch(Leaf(1), 3, Leaf(4))") {
        it("return 1") {
          assert(branch1.min == 1)
        }
      }
      describe("Branch(Leaf(2), 3, Leaf(4))") {
        it("return 2") {
          assert(branch4.min == 2)
        }
      }
    }
  }

  describe("BTree") {
    val bTree1 = BTree(Leaf(1))
    val bTree2 = BTree(Branch(Leaf(1), 2, Leaf(3)))
    describe("#size") {
      describe("given BTree(Leaf(1)") {
        it("return 1") {
          assert(bTree1.size == 1)
        }
      }
      describe("given Branch(Leaf(1), 2, Leaf(3))") {
        it("return 3") {
          assert(bTree2.size == 3)
        }
      }
    }
    describe("#max") {
      describe("given BTree(Leaf(1)") {
        it("return 1") {
          assert(bTree1.max == 1)
        }
      }
      describe("given BTree(Branch(Leaf(1), 2, Leaf(3)))") {
        it("return 3") {
          assert(bTree2.max == 3)
        }
      }
    }
  }
}