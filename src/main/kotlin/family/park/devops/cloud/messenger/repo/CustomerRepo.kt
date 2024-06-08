package family.park.devops.cloud.messenger.repo

import family.park.devops.cloud.messenger.entity.Customer
import family.park.devops.cloud.messenger.model.CustomInsert
import family.park.devops.cloud.messenger.model.UpdatingMember
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.stereotype.Repository

@Repository
class CustomersRepo(
    private val sqlSessionTemplate: SqlSessionTemplate
){
    fun insertCustomer(insertMember: CustomInsert)=
        sqlSessionTemplate.insert("COMMON.insertMember",insertMember)

    fun searchMemeberById(id : Long)=
        sqlSessionTemplate.selectOne<Customer>("COMMON.selectMemberInfo", id)

    fun deleteById(id: Long)=
        sqlSessionTemplate.selectOne<Customer>("COMMON.deleteMember", id)

    fun updateMemberById( updateMember : UpdatingMember)=
        sqlSessionTemplate.update("COMMON.updateMember",updateMember)
}