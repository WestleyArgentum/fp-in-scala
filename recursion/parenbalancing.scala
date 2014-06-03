
def balance(chars: List[Char]): Boolean = {
  def balance(chars: List[Char], num_unmatched: Int): Boolean = {
    if (chars.isEmpty || num_unmatched < 0) {
      return num_unmatched == 0
    }

    val unmatched = (chars.head: @switch) match {
      case '(' => num_unmatched + 1
      case ')' => num_unmatched - 1
      case _ => num_unmatched
    }

    return balance(chars.tail, unmatched)
  }

  return balance(chars, 0)
}
