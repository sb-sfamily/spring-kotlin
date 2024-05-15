package family.park.devops.cloud.messenger.entity

import java.time.LocalDate
import java.time.LocalDateTime

data class Customer(
    val memberId : Long
    ,var name : String
    ,var surname : String?
    ,var birthDate : LocalDate
    ,var email : String
    ,var password : String
    ,var joinDate : LocalDate
    ,var createDt : LocalDateTime
    ,var updateDt : LocalDateTime?
    ,var createUser : Long
    ,var updateUser : Long?
)


data class CustomerShort(
    val memberId : Long
    ,var name : String
    ,var surname : String?
)