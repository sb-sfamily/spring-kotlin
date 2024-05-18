package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.repo.EventRepo
import org.springframework.stereotype.Service


@Service
class EventService(
    private val eventRepo: EventRepo,
    repo: EventRepo
) {
    fun getEvent(id: Long) = eventRepo.getEvent(id)

    fun getTable(title : String) = eventRepo.getTable(title)
}
