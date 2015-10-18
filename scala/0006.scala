def sumOfSquares(n: Int): Int = {
  @annotation.tailrec
  def loop(n: Int, accum: Int): Int = {
    if (n < 1) accum
    else loop(n - 1, accum + (n * n))
  }
  loop(n, 0)
}

def squareOfSums(n: Int) = {
    @annotation.tailrec
    def sum(n: Int, accum: Int): Int = {
      if (n < 1) accum
      else sum(n - 1, accum + n)
    }
    val sumAll = sum(n,0)
    sumAll * sumAll
}

def diff(n: Int): Int = {
  squareOfSums(n) - sumOfSquares(n)
}

println(diff(100))
