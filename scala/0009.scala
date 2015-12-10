def triplets(n: Int): Seq[(Int,Int,Int)] = {
  for {
    x <- 1 to n
    y <- x + 1 to n
    z <- y + 1 to n
    if (x + y + z == n)
  } yield (x,y,z)
}

val res = triplets(1000).filter{case (x,y,z) => Math.pow(x,2) + Math.pow(y,2) == Math.pow(z,2)}
val (x,y,z) = res.head
println(x * y * z)
