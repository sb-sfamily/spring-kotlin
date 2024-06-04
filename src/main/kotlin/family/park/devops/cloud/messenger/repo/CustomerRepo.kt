package family.park.devops.cloud.messenger.repo

import family.park.devops.cloud.messenger.entity.Customer
import family.park.devops.cloud.messenger.entity.CustomerShort
import family.park.devops.cloud.messenger.model.CustomInsert
import family.park.devops.cloud.messenger.model.SearchMember
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.stereotype.Repository

@Repository
class CustomersRepo(
    private val sqlSessionTemplate: SqlSessionTemplate
){
    fun getMemeberBrief(memberId: Long) =
        sqlSessionTemplate.selectOne<CustomerShort>("COMMON.selectMemberBrief",memberId)


    fun insertCustomer(insertMember: CustomInsert)=
        sqlSessionTemplate.insert("COMMON.insertMember",insertMember)

    fun searchMemeberById(searchMember: SearchMember)=
        sqlSessionTemplate.selectOne<Customer>("COMMON.selectMemberInfo", searchMember)
}