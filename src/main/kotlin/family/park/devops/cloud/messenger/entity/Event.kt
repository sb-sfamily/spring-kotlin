package family.park.devops.cloud.messenger.entity

import family.park.devops.cloud.messenger.annotation.DateFormat
import family.park.devops.cloud.messenger.annotation.DateTimeFormat
import java.time.LocalDate
import java.time.LocalDateTime


data class Event(
    val id : Long?,
    var title : String,
    var operatorId : Long,
    var eventType : String,
    @DateFormat
    var regDate: LocalDate = LocalDate.now(),
    @DateTimeFormat
    var fromDt: LocalDateTime,
    @DateTimeFormat
    var toDt: LocalDateTime,
    var description: String,
    var placeName : String,
    var placeAddr : String,
    @DateTimeFormat
    var createDt : LocalDateTime = LocalDateTime.now(),
    @DateTimeFormat
    var updateDt : LocalDateTime?,
    var createUserId : Long,
    var updateUserId : Long?
)
