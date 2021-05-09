package com.knoldus.validator

class EmailValidator {
  def isValid(emailId:String):Boolean={
    if ("""(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(emailId) == None) {
      false
    } else {
      true
    }
  }

}
