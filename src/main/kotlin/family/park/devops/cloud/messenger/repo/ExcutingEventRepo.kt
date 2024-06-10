package family.park.devops.cloud.messenger.repo

import family.park.devops.cloud.messenger.entity.InsertExecutingEvent
import org.mybatis.spring.SqlSessionTemplate

class ExcutingEventRepo(
    private val sqlSessionTemplate: SqlSessionTemplate
) {

    fun insertsExtraEvents(inserting : InsertExecutingEvent)
    = sqlSessionTemplate.insert("ExecutingEvent.insertExecutingEvent", inserting)

}