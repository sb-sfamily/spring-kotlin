package family.park.devops.cloud.messenger.repo

import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
import family.park.devops.cloud.messenger.entity.SearchWithJoin
import org.mybatis.spring.SqlSessionTemplate

class ExcutingEventRepo(
    private val sqlSessionTemplate: SqlSessionTemplate
) {

    fun insertsExtraEvents(inserting : InsertExecutingEvent)
    = sqlSessionTemplate.insert("ExecutingEvent.insertExecutingEvent", inserting)

    fun serachingWithJoin( id : Long)
    = sqlSessionTemplate.selectOne<SearchWithJoin>("ExecutingEvent.selectingExcutingEventWithRegDate", id)
}