
def pascal(c: Int, r: Int): Int = {
	if (c == 0 || c == r) {
	  return 1
	}

	pascal(c - 1, r - 1) + pascal(c, r - 1)
}
