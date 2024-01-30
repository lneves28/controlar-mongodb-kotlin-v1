package controlar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ControlarMongodbV1Application

fun main(args: Array<String>) {
    runApplication<ControlarMongodbV1Application>(*args)
}
