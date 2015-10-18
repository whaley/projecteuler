val oddNums: Stream[Long] = {
  def loop(n: Long): Stream[Long] = n #:: loop(n + 2)
  loop(3)
}
val primes: Stream[Long] = 2 #:: oddNums.filter(i =>
  primes.takeWhile{j => j * j <= i}.forall{ k => i % k > 0})

def nthPrime(n: Int): Long = {
  primes.take(n).last
}

println(nthPrime(10001))
