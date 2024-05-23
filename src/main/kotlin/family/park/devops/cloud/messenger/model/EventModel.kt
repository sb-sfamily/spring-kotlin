package family.park.devops.cloud.messenger.model

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class SearchEvent(
    val title : String?,
    val fromFromDate : String?,
    val fromToDate : String?,
    val statusOfEvent : String?// 진행상태 ( before, ing, after)
)

data class InsertEvent(
    var title : String,
    var operatorId : Long,
    var eventType : String,
    var regDate: String = LocalDate.now().format(TimeFormat.DATETIME_PATTERN),
    var fromDt: String,
    var toDt: String,
    var description: String,
    var placeName : String,
    var placeAddr : String,
    var createDt : String = LocalDateTime.now().format(TimeFormat.DATE_PATTERN_FORMATTER),
    var createUserId : Long

)

data class EventTmp (
    val id : Long?,
    var title : String,
    var operatorId : Long,
    var eventType : String,
    var regDate: String = LocalDate.now().format(TimeFormat.DATETIME_PATTERN),
    var fromDt: String,
    var toDt: String,
    var description: String,
    var placeName : String,
    var placeAddr : String,
    var createDt : String = LocalDateTime.now().format(TimeFormat.DATE_PATTERN_FORMATTER),
    var updateDt : String?,
    var createUserId : Long,
    var updateUserId : Long?
)

object TimeFormat {
    val DATETIME_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val DATE_PATTERN_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy")
}
