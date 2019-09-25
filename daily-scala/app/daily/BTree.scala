package daily

trait Node {
<<<<<<< HEAD
  // ...
}

case class Branch extends Node {
// ...
}

case class Leaf extends Node {
// ...
=======
  def value: Int
  def size: Int
  def max: Int
}

case class Branch(left: Node, value: Int, right: Node) extends Node {
  val size = left.size + 1 + right.size
  val max = 4
}

case class Leaf(value: Int) extends Node {
  val size = 1
  val max = value
>>>>>>> 7cb0607... WIP size and max
}

case class BTree(node: Node) {
  val size = node.size
}