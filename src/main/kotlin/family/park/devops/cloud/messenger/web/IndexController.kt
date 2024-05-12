package family.park.devops.cloud.messenger.web

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/index")
class IndexController {
    val studentList = mutableListOf<String>()

    @GetMapping
    fun index() = mapOf("greeting word" to "Hello World")

    @GetMapping("state")
    fun listState(): List<String> {
        return studentList
    }

    @PostMapping("/create")
    fun addStudent(@RequestBody map: Map<String, String>) = studentList.apply {
        add(map["name"]!!)
    }

    @PostMapping("/delete")
    fun deleteStudent(@RequestBody map: Map<String, String>) = studentList.apply {
        if(studentList.isEmpty()){
            println("no student list")
        }
        removeLast()
    }
}