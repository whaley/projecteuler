//brute force
def isPalindrome(s: String): Boolean = s == s.reverse
val palindromes = for {
  a <- 100 until 1000
  b <- 100 until 1000
  prod = a * b
  if isPalindrome(prod.toString)
} yield prod
println(pairs.max)
