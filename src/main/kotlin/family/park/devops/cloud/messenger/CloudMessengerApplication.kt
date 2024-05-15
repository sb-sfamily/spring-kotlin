package family.park.devops.cloud.messenger

import family.park.devops.cloud.messenger.repo.CustomerRepo
import org.apache.ibatis.session.SqlSessionFactory
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.sql.DataSource

@SpringBootApplication
class CloudMessengerApplication : ApplicationRunner {
	private val logger = LoggerFactory.getLogger(CloudMessengerApplication::class.java)

	@Autowired
	lateinit var customerRepo : CustomerRepo
	override fun run(args: ApplicationArguments?) {
		logger.info( customerRepo.getMemeberBrief(3L).toString() )
	}

}

fun main(args: Array<String>) {
	runApplication<CloudMessengerApplication>(*args)
}
