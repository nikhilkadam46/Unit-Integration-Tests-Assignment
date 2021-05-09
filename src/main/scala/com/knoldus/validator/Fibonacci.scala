package com.knoldus.validator
class Fibonacci {
    def fib(n: Int): Int = {
      if (n >= 3) {
        fib(n - 1) + fib(n - 2)
      } else {
        1
      }
    }


}
