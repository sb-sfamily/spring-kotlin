package family.park.devops.cloud.messenger.model

import com.fasterxml.jackson.annotation.JsonFormat
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATETIME
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATE
import java.time.LocalDate
import java.time.LocalDateTime

data class CustomInsert(
    var name : String,
    var surname : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATE)
    var birthDate : LocalDate,
    var email : String,
    var password : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var joinDate : LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var createDt : LocalDateTime,
    var createUser : Long
)

data class SearchMember(
    var member_id : Long
)