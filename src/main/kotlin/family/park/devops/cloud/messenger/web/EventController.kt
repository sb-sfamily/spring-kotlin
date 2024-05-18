package family.park.devops.cloud.messenger.web

import family.park.devops.cloud.messenger.service.EventService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/events")
class EventController(private val eventService: EventService) {
    @GetMapping("/{id}")
    fun getEvent(@PathVariable id: Long) = eventService.getEvent(id)


    @GetMapping("/{title}")
    fun getTable(@PathVariable title:String) = eventService.getTable(title)
}