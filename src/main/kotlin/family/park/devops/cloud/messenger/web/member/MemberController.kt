package family.park.devops.cloud.messenger.web.member

import family.park.devops.cloud.messenger.model.CustomInsert
import family.park.devops.cloud.messenger.model.UpdatingMember
import family.park.devops.cloud.messenger.service.CustomService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/member")
class MemberController(private val customService: CustomService) {
    @PostMapping("/insert")
    fun insertMember(@RequestBody insertingMembers: CustomInsert)=customService.insertingMember(insertingMembers)

    @GetMapping("/{id}")
    fun searchingMember(@PathVariable id : Long) = customService.searchMember(id)

    @DeleteMapping("/{id}")
    fun deleteMember(@PathVariable id : Long) = customService.deleteMember(id)

    @PostMapping("/update")
    fun update(@RequestBody updateMember : UpdatingMember ) = customService.updateMember(updateMember)
}