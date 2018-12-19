package io.ddojai.firstwebservicewithkotlin.controller

import io.ddojai.firstwebservicewithkotlin.domain.WelcomeBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicController {
    @GetMapping("/welcome")
    fun welcome() = "Hello World"

    @GetMapping("/welcome-with-object")
    fun welcomeWithObject() = WelcomeBean("Hello World")

    @GetMapping("/welcome-with-parameter/name/{name}")
    fun welcomeWithParameter(@PathVariable name: String) = WelcomeBean("Hello World, $name")
}