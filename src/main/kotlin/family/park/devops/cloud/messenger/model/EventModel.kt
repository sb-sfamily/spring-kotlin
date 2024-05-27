package family.park.devops.cloud.messenger.model

import com.fasterxml.jackson.annotation.JsonFormat
import family.park.devops.cloud.messenger.annotation.DateFormat
import family.park.devops.cloud.messenger.annotation.DateTimeFormat
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATE
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATETIME
import java.time.LocalDate
import java.time.LocalDateTime

data class SearchEvent(
    val title : String?,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    val fromFromDate : LocalDateTime?,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    val fromToDate : LocalDateTime?,
    val statusOfEvent : String?// 진행상태 ( before, ing, after)
)


data class UpdateEvent(
    var id: Long,
    var title: String,
    var operatorId : Long,
    var eventType : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var fromDt : LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var toDt : LocalDateTime,
    var description : String,
    var placeName : String,
    var placeAddr : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var updateDt : LocalDateTime = LocalDateTime.now(),
    var updateUserId : Long
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