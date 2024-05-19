package family.park.devops.cloud.messenger.entity

import java.time.LocalDate
import java.time.LocalDateTime


data class Event(
    val id : Long?,
    var title : String,
    var operatorId : Long,
    var eventType : String,
    var regDate: LocalDate = LocalDate.now(),
    var fromDt: LocalDateTime,
    var toDt: LocalDateTime,
    var description: String,
    var placeName : String,
    var placeAddr : String,
    var createDt : LocalDateTime = LocalDateTime.now(),
    var updateDt : LocalDateTime?,
    var createUserId : Long,
    var updateUserId : Long?
)


data class ShortMember(
    val MemberId : Int,
    var name : String,
    var age : Int
)