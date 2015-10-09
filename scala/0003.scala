//These stream is not needed, as I forgot how prime factorization works

/*
val oddNums: Stream[Long] = {
  def loop(n: Long): Stream[Long] = n #:: loop(n + 2)
  loop(3)
}
val primes: Stream[Long] = 2 #:: oddNums.filter(i =>
  primes.takeWhile{j => j * j <= i}.forall{ k => i % k > 0})
*/

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
