package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
import family.park.devops.cloud.messenger.repo.ExecutingEventRepo
import org.springframework.stereotype.Service

@Service
class ExecuteEventService(
    private val executeEventRepo : ExecutingEventRepo
) {

    fun insertExecutingEvent(event : InsertExecutingEvent)
    =executeEventRepo.insertsExtraEvents(event)

    fun searchWithJoin( id : Long )
    =executeEventRepo.serachingWithJoin(id)
}