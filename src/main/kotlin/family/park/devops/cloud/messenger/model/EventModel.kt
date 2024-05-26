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


data class UpdateEvent(
    var id: Long,
    var title: String,
    var operator_id : Long,
    var event_type : String,
    @DateTimeFormat
    var from_dt : LocalDateTime,
    @DateTimeFormat
    var to_dt : LocalDateTime,
    var description : String,
    var place_name : String,
    var place_addr : String,
    @DateTimeFormat
    var update_dt : LocalDateTime = LocalDateTime.now(),
    var update_user_id : Long
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