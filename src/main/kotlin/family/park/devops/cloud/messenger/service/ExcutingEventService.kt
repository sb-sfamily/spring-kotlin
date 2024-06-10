package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
import family.park.devops.cloud.messenger.repo.ExcutingEventRepo

class ExcutingEventService(
    private val excutingEventRepo : ExcutingEventRepo,
    repo : ExcutingEventRepo
) {

    fun insertExcutingEvent(event : InsertExecutingEvent)
    =excutingEventRepo.insertsExtraEvents(event)

}