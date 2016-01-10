package models

import java.util.Date

case class Employee(name: String, email: String, dob: Date, companyName: String, id: Option[Int] = None)
