package daily

class S99 {
  // p09 Pack consecutive duplicates of list elements into sublists.
  def pack(ls: List[String]): List[List[String]] = {
    ls match {
      case head :: _ => {
        val (packed, other) = ls.span(s => s == ls.head)
        packed :: pack(other)
      }
      case Nil => Nil
    }
  }

  // p10 Run-length encoding of a list.
  def encode(ls: List[String]): List[(Int, String)] = {
    val packResult = pack(ls)
    packResult.map(p => (p.size, p.head))
  }

  // p11 Modified run-length encoding.
  def encodeModified(list: List[String]): List[Any] = {
    val encodeResult = encode(list)
    encodeResult.map {
      r => r match {
        case (1, s) => s
        case (_, _) => r
      }
    }
  }

  // p12 Decode a run-length encoded list.
  def decode(ls: List[(Int, String)]): List[String] = ???

  // p13 Run-length encoding of a list (direct solution).
  def encodeDirect(ls: List[String]): List[(Int, String)] = ???

}
