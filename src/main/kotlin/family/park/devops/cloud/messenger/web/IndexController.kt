package family.park.devops.cloud.messenger.web

import org.springframework.web.bind.annotation.*
import java.util.LinkedHashMap
import javax.print.DocFlavor.STRING

@RestController
@RequestMapping("/index")
class IndexController {
    val studentList = mutableListOf<String>()

    @GetMapping
    fun index() = mapOf("greeting word" to "Hello World")

    @PostMapping("/create")
    fun addStudent(@RequestBody map: Map<String, String>) = studentList.apply {
        add(map["name"]!!)
    }
}