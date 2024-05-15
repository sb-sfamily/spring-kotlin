package family.park.devops.cloud.messenger.web

import family.park.devops.cloud.messenger.repo.CustomerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/")
class IndexController {
    val studentList = mutableListOf<String>()




    @GetMapping
    fun index() = "member/index"

    @GetMapping("state")
    @ResponseBody
    fun listState(): List<String> {
        return studentList
    }


    @Autowired
    lateinit var customerRepo : CustomerRepo
    @GetMapping("memberBrief/{memberId}")
    @ResponseBody
    fun getMemeberBrief(@PathVariable memberId : Long )= customerRepo.getMemeberBrief(memberId)


    @PostMapping("/create")
    @ResponseBody
    fun addStudent(@RequestBody map: Map<String, String>) = studentList.apply {
        add(map["name"]!!)
    }

    @PostMapping("/delete")
    @ResponseBody
    fun deleteStudent(@RequestBody map: Map<String, String>) = studentList.apply {
        if(studentList.isEmpty()){
            println("no student list")
        }
        removeLast()
    }
}