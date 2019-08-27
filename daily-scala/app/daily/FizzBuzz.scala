package daily

class FizzBuzz {
  def execute(num: Int) = {
    num match {
      case n if (n % 3 == 0 && n % 5 == 0) => "FizzBuzz"
      case n if (n % 3 == 0) => "Fizz"
      case n if (n % 5 == 0) => "Buzz"
      case n => n.toString
    }
  }
}
