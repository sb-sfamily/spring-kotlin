package family.park.devops.cloud.messenger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudMessengerApplication

fun main(args: Array<String>) {
	runApplication<CloudMessengerApplication>(*args)
}
