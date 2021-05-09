import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValitest extends AnyFlatSpec{

  "EmployeeValitest" should "verify if employee is valid or not" in {

    val Obj = new EmployeeValidator
    assert(Obj.employeeIsValid(Employee("april","Ver",22,40000,"Software Consultant","Knoldus","jhoncena@gmail.com")) == true)

  }

}
