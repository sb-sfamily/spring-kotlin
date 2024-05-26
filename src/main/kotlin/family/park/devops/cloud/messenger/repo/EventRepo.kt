package family.park.devops.cloud.messenger.repo

import family.park.devops.cloud.messenger.entity.Event
import family.park.devops.cloud.messenger.model.InsertEvent
import family.park.devops.cloud.messenger.model.SearchEvent
import family.park.devops.cloud.messenger.model.UpdateEvent
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.stereotype.Repository

@Repository
class EventRepo(
    private val sqlSessionTemplate: SqlSessionTemplate
) {
    fun getEvent(id: Long) =
        sqlSessionTemplate.selectOne<Event>("EVENT.selectEvent", id)

    fun getListEvents(searchEvent: SearchEvent) =
        sqlSessionTemplate.selectList<Event>("EVENT.selectListEvents", searchEvent)

    fun insertsEvents(event: InsertEvent) = sqlSessionTemplate.insert("EVENT.insertingEvent", event)


    fun selectListEventsByStatus(searchEvent: SearchEvent) =
        sqlSessionTemplate.selectList<Event>("EVENT.selectListEventsByStauts", searchEvent)

    fun deleteEvent(id : Long)=
        sqlSessionTemplate.selectOne<Event>("EVENT.deleteEvent", id)

    fun updateEvent(updatingEvent: UpdateEvent)=
        sqlSessionTemplate.selectList<Event>("EVENT.updateEvent", updatingEvent)
}