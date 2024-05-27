package family.park.devops.cloud.messenger.model

import com.fasterxml.jackson.annotation.JsonFormat
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
    var updateDt : LocalDateTime,
    var updateUserId : Long
)


data class InsertEvent(
    var title : String,
    var operatorId : Long,
    var eventType : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var regDate: LocalDateTime?,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var fromDt: LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var toDt: LocalDateTime,
    var description: String,
    var placeName : String,
    var placeAddr : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var createDt : LocalDateTime,
    var createUserId : Long
)