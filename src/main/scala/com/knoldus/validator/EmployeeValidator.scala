package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {

  val obj = new CompanyReadDto
  val emailvalidobj = new EmailValidator

  def employeeIsValid(employee: Employee): Boolean =
    if(obj.companies.contains(employee.companyName) && emailvalidobj.isValid(employee.emailId)) true
    else false


}
