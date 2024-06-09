package family.park.devops.cloud.messenger.model

import com.fasterxml.jackson.annotation.JsonFormat
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATETIME
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
    var eventType : String,
    var description : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var updateDt : LocalDateTime,
    var updateUserId : Long
)


data class InsertEvent(
    var title : String,
    var eventType : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var regDate: LocalDateTime?,
    var description: String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var createDt : LocalDateTime,
    var createUserId : Long
)