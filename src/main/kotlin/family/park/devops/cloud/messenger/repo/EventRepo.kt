package family.park.devops.cloud.messenger.repo

import family.park.devops.cloud.messenger.entity.Event
import family.park.devops.cloud.messenger.model.EventTmp
import family.park.devops.cloud.messenger.model.InsertEvent
import family.park.devops.cloud.messenger.model.SearchEvent
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.stereotype.Repository

@Repository
class EventRepo(
    private val sqlSessionTemplate: SqlSessionTemplate
){
    fun getEvent(id: Long) =
        sqlSessionTemplate.selectOne<Event>("EVENT.selectEvent",id)

    fun getListEvents(searchEvent : SearchEvent)
    = sqlSessionTemplate.selectList<Event>("EVENT.selectListEvents",searchEvent)

    fun insertsEvents(event: InsertEvent) {
        sqlSessionTemplate.insert("EVENT.insertingEvent", event)
    }
}