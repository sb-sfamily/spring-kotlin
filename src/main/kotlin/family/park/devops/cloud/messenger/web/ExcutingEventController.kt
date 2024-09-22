package family.park.devops.cloud.messenger.web

import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
import family.park.devops.cloud.messenger.service.ExecuteEventService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/ExecutingEvent")
class ExecutingEventController (private val executeEventService: ExecuteEventService) {

    @PostMapping("/insert")
    fun insertListEvents(@RequestBody insertEvents : InsertExecutingEvent) = executeEventService.insertExecutingEvent(insertEvents)

    @GetMapping("/{id}")
    fun searchingWithJoin(@PathVariable id : Long) = executeEventService.searchWithJoin(id)
}