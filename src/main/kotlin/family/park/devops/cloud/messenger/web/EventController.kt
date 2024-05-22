package family.park.devops.cloud.messenger.web

import family.park.devops.cloud.messenger.model.InsertEvent
import family.park.devops.cloud.messenger.model.SearchEvent
import family.park.devops.cloud.messenger.service.EventService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/events")
class EventController(private val eventService: EventService) {
    @GetMapping("/{id}")
    fun getEvent(@PathVariable id: Long) = eventService.getEvent(id)


    @PostMapping("/list")
    fun getListEvents(@RequestBody searchEvent: SearchEvent) = eventService.getListEvents(searchEvent)

    @PostMapping("/insert")
    fun insertListEvent(@RequestBody insertEvents : InsertEvent) = eventService.insertListEvent(insertEvents)

    @GetMapping("/status")
    fun selectListEventsByStatus(@RequestBody searchEvent: SearchEvent) = eventService.selectListEventsByStatus(searchEvent)

}