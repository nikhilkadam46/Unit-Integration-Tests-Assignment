import com.knoldus.validator.divide
import org.scalatest.flatspec.AnyFlatSpec

class dividetest extends AnyFlatSpec{
    val obj =new divide
    val ans=obj.div(8,2)
    assert(ans==4)

}
