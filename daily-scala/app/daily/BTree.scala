package daily

trait Node {
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
}

case class BTree(node: Node) {
  val size = node.size
}