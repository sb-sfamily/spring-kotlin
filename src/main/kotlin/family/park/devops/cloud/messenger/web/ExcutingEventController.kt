//package family.park.devops.cloud.messenger.web
//
//import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
//import family.park.devops.cloud.messenger.service.ExcuteEventService
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestBody
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//
//
//@RestController
//@RequestMapping("/v1/excutingEvent")
//class ExcutingEventController (private val excuteEventService: ExcuteEventService) {
//
//    @PostMapping("/insert")
//    fun insertListEvents(@RequestBody insertEvents : InsertExecutingEvent) = excuteEventService.insertExcutingEvent(insertEvents)
//}