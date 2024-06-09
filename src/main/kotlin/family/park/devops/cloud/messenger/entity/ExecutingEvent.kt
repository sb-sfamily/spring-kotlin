package family.park.devops.cloud.messenger.entity

import com.fasterxml.jackson.annotation.JsonFormat
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATETIME
import java.time.LocalDateTime

data class ExecutingEvent(
    var id : Long,
    var title : String,
    var eventSerialNumber : Long,
    var operatorId : Long,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var regDate : LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var fromDt : LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var toDt : LocalDateTime,
    var placeName : String,
    var placeAddr : String
)