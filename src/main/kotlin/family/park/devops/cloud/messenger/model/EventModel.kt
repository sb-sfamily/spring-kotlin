package family.park.devops.cloud.messenger.model

import family.park.devops.cloud.messenger.annotation.DateFormat
import family.park.devops.cloud.messenger.annotation.DateTimeFormat
import java.time.LocalDate
import java.time.LocalDateTime

data class SearchEvent(
    val title : String?,

    val fromFromDate : LocalDateTime?,
    @DateTimeFormat
    val fromToDate : LocalDateTime?,
    val statusOfEvent : String?// 진행상태 ( before, ing, after)
)

data class InsertEvent(
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
    var createUserId : Long

)