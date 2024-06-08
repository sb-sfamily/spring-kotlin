package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.model.CustomInsert
import family.park.devops.cloud.messenger.model.UpdatingMember
import family.park.devops.cloud.messenger.repo.CustomersRepo
import org.springframework.stereotype.Service

@Service
class CustomService(
    private val customrepo: CustomersRepo,
    repo: CustomersRepo
){
    fun insertingMember(customerInsert: CustomInsert)=
        customrepo.insertCustomer(customerInsert)

    fun searchMember( id : Long)=
        customrepo.searchMemeberById(id)

    fun deleteMember(id:Long)=
        customrepo.deleteById(id)

    fun updateMember(updateMember: UpdatingMember)=
        customrepo.updateMemberById(updateMember)
}
