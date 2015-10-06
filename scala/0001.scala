def fizzbuzzes(n: Int): Seq[Int] = {
  for {
     x <- 0 until n
     if (x % 3) == 0 || (x % 5) == 0
   } yield x
}

def solve(n: Int): Int = {
  fizzbuzzes(n).sum
}

println(solve(1000))
