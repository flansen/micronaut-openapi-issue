package example.micronaut

import io.micronaut.runtime.Micronaut
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
        info = Info(
                title = "Hello World",
                version = "0.0",
                description = "My API"
        )
)
object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("example.micronaut")
                .mainClass(Application.javaClass)
                .start()
    }
}