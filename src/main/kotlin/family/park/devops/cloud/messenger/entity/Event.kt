package family.park.devops.cloud.messenger.entity

import com.fasterxml.jackson.annotation.JsonFormat
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATE
import family.park.devops.cloud.messenger.consts.MessegnerDateFormat.DATETIME
import java.time.LocalDate
import java.time.LocalDateTime


data class Event(
    val id : Long?,
    var title : String,
    var eventType : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATE)
    var regDate: LocalDate,
    var description: String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var createDt : LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var updateDt : LocalDateTime?,
    var createUserId : Long,
    var updateUserId : Long?
)