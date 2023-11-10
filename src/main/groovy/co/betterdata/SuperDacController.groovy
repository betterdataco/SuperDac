package co.betterdata

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/superDac")
class SuperDacController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}