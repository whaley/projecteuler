//Brute Force
def f(n: Int): Long = {
  @annotation.tailrec
  def loop(x: Long): Long = {
    if ((1 to n).forall(x % _ == 0)) x
    else loop(x + 1)
  }
  loop(1)
}

println(f(20))
