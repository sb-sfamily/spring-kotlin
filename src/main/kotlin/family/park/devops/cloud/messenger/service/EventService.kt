package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.model.InsertEvent
import family.park.devops.cloud.messenger.model.SearchEvent
import family.park.devops.cloud.messenger.model.UpdateEvent
import family.park.devops.cloud.messenger.repo.EventRepo
import org.springframework.stereotype.Service


@Service
class EventService(
    private val eventRepo: EventRepo,
    repo: EventRepo
) {
    fun getEvent(id: Long) = eventRepo.getEvent(id)

    fun getListEvents(searchEvent: SearchEvent) = eventRepo.getListEvents(searchEvent)

    fun insertListEvent(insertEvent: InsertEvent) = eventRepo.insertsEvents(insertEvent)

    fun selectListEventsByStatus(searchEvent: SearchEvent) = eventRepo.selectListEventsByStatus(searchEvent)

    fun deleteEvent(id : Long)= eventRepo.deleteEvent(id)

    fun updatesEvent( updating:UpdateEvent) = eventRepo.updateEvent(updating)

}