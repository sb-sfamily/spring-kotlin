package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.model.EventTmp
import family.park.devops.cloud.messenger.model.SearchEvent
import family.park.devops.cloud.messenger.repo.EventRepo
import org.springframework.stereotype.Service


@Service
class EventService(
    private val eventRepo: EventRepo,
    repo: EventRepo
) {
    fun getEvent(id: Long) = eventRepo.getEvent(id)

    fun getListEvents(searchEvent: SearchEvent) = eventRepo.getListEvents(searchEvent)

    fun includeListEvent(eventTmp: EventTmp) = eventRepo.insertEvent(eventTmp)
}