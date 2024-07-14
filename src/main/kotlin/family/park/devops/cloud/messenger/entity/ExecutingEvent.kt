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
    var regDate : LocalDateTime ,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var fromDt : LocalDateTime ,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var toDt : LocalDateTime ,
    var placeName : String ,
    var placeAddr : String
)

data class SearchWithJoin(
    var id : Long,
    var title : String,
    var event_serial_number : Long,
    var operator_id : Long,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var reg_date : LocalDateTime ,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var from_dt : LocalDateTime ,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var to_dt : LocalDateTime ,
    var place_name : String,
    var place_addr : String,
    var event_type : String,
    var description : String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var create_dt : LocalDateTime,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= DATETIME)
    var update_dt : LocalDateTime,
    var create_user_id : Long,
    var update_user_id : Long,
    var status_of_event : String
)



data class InsertExecutingEvent(
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