
import scala.annotation.switch

def balanced(chars: List[Char]): Boolean = {

  def balanced(chars: List[Char], num_unmatched: Int): Boolean = {
    if (chars.isEmpty || num_unmatched < 0) {
      return num_unmatched == 0
    }

    val unmatched = (chars.head: @switch) match {
      case '(' => num_unmatched + 1
      case ')' => num_unmatched - 1
      case _ => num_unmatched
    }

    balanced(chars.tail, unmatched)
  }

  balanced(chars, 0)
}
