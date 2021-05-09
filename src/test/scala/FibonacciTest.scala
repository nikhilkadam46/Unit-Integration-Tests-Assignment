import com.knoldus.validator.Fibonacci
import org.scalatest.flatspec.AnyFlatSpec

class FibonacciTest extends AnyFlatSpec{
  val obj=new Fibonacci
  val a=obj.fib(1)
  assert(a==1)
}
