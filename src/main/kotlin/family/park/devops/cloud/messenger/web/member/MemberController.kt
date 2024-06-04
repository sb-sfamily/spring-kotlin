package family.park.devops.cloud.messenger.web.member

import family.park.devops.cloud.messenger.model.CustomInsert
import family.park.devops.cloud.messenger.model.SearchMember
import family.park.devops.cloud.messenger.service.CustomService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/member")
class MemberController(private val customService: CustomService) {
    @PostMapping("/insert")
    fun insertMember(@RequestBody insertingMembers: CustomInsert)=customService.insertingMember(insertingMembers)

    @GetMapping("/{id}")
    fun searchingMember(@PathVariable id : Long) = customService.searchMember(id)
}