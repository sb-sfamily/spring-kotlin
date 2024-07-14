package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
import family.park.devops.cloud.messenger.entity.SearchWithJoin
import family.park.devops.cloud.messenger.repo.ExcutingEventRepo

class ExcuteEventService(
    private val excuteEventRepo : ExcutingEventRepo,
    repo : ExcutingEventRepo
) {

    fun insertExcutingEvent(event : InsertExecutingEvent)
    =excuteEventRepo.insertsExtraEvents(event)

    fun searchWithJoin( id : Long )
    =excuteEventRepo.serachingWithJoin(id)
}