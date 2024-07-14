package family.park.devops.cloud.messenger.web

import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
import family.park.devops.cloud.messenger.service.ExcuteEventService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/excutingEvent")
class ExecutingEventController (private val executeEventService: ExcuteEventService) {

    @PostMapping("/insert")
    fun insertListEvents(@RequestBody insertEvents : InsertExecutingEvent) = executeEventService.insertExcutingEvent(insertEvents)

    @GetMapping("/get")
    fun searchingWithJoin(@PathVariable id : Long) = executeEventService.searchWithJoin(id)
}