package daily

class S99 {
  // p09 Pack consecutive duplicates of list elements into sublists.
  def pack(ls: List[String]): List[List[String]] = {
    List(ls)
  }

  // p10 Run-length encoding of a list.
  def encode(ls: List[List[String]]): List[(Int, String)] = ???

  // p11 Modified run-length encoding.
  def encodeModified(list: List[String]): List[Any] = ???

  // p12 Decode a run-length encoded list.
  def decode(ls: List[(Int, String)]): List[String] = ???

  // p13 Run-length encoding of a list (direct solution).
  def encodeDirect(ls: List[String]): List[(Int, String)] = ???

}