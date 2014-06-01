package pascalstriangle

object PascalsTriangleApp extends App {

  def pascal(c: Int, r: Int): Int = {
    if (r < 2 || c == 0 || c == r) {
      return 1
    }

    return pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

}
