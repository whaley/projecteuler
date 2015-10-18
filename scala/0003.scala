def primeFactors(x: Long): List[Long] = {
  @annotation.tailrec
  def loop(n: Long, d: Long, accum: List[Long]): List[Long] = {
    if (n <= 1) accum
    else if (n % d == 0) loop(n / d, d, d :: accum)
    else loop(n, d + 1, accum)
  }
  loop(x, 2, Nil)
}

val subj = 600851475143L
println(primeFactors(subj).max)
