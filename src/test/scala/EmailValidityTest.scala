import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidityTest extends AnyFlatSpec {
  "emailValidityTest" should "Verify if the emailId or not" in {
    val Obj = new EmailValidator
    assert(Obj.isValid("jhoncena@gmail.com")==true)
  }
}
