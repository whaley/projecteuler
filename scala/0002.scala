val fourMillion = 4 * 1000 * 1000
val fibs : Stream[Int] = 1 #:: 2 #:: fibs.zip(fibs.tail).map({case (x,y) => x + y})
val answer = fibs.takeWhile(_ < fourMillion).filter(_ % 2 == 0).sum
println(answer)
