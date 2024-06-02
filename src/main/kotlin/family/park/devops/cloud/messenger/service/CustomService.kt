package family.park.devops.cloud.messenger.service

import family.park.devops.cloud.messenger.entity.Customer
import family.park.devops.cloud.messenger.model.CustomInsert
import family.park.devops.cloud.messenger.repo.CustomerRepo
import org.springframework.stereotype.Service

@Service
class CustomService(
    private val customrepo: CustomerRepo,
    repo: CustomerRepo
){
    fun insertingMember(customerInsert: CustomInsert)=
        customrepo.insertCustomer(customerInsert)
}
