package daily

trait Node {
  // ...
}

case class Branch extends Node {
// ...
}

case class Leaf extends Node {
// ...
}

case class BTree(node: Node) {
  // ...
}